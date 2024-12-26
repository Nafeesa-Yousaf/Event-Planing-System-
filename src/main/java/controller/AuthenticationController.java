package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import models.AuthenticationModel;
import resources.DatabaseConnection;
import view.HomeScreen;

public class AuthenticationController {

    public static boolean registerUser(AuthenticationModel authModel) {
        Connection connection = DatabaseConnection.connect();

        if (connection == null) {
            showErrorDialog("Database connection failed");
            return false;
        }

        String checkEmailQuery = "SELECT COUNT(*) FROM users WHERE email = ?";

        try (PreparedStatement checkEmailStmt = connection.prepareStatement(checkEmailQuery)) {
            checkEmailStmt.setString(1, authModel.getEmail());
            ResultSet resultSet = checkEmailStmt.executeQuery();

            if (resultSet.next() && resultSet.getInt(1) > 0) {
                showErrorDialog("User already registered with the same email");
                return false;
            }

            String insertQuery = "INSERT INTO users (email, password, role) VALUES (?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, authModel.getEmail());
                preparedStatement.setString(2, authModel.getPassword());
                preparedStatement.setString(3, authModel.getRole());

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        int authId = generatedKeys.getInt(1);
                        String id = generateUniqueId(authId);

                        return EventOrganizorController.createEventOrganizor(authModel.getEmail(), authId, id);
                    }
                }
                return false;

            } catch (SQLException e) {
                showErrorDialog("Error while inserting user: " + e.getMessage());
                return false;
            }
        } catch (SQLException e) {
            showErrorDialog("Error while checking email: " + e.getMessage());
            return false;
        } finally {
            closeConnection(connection);
        }
    }

    public static boolean authenticateUser(AuthenticationModel authModel) {
        Connection connection = DatabaseConnection.connect();

        if (connection == null) {
            return false;
        }

        String query = "SELECT * FROM users WHERE email = ? AND password = ? AND role = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, authModel.getEmail());
            preparedStatement.setString(2, authModel.getPassword());
            preparedStatement.setString(3, authModel.getRole());

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int authId = resultSet.getInt("id");
                displayHomeScreen(authId);
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            closeConnection(connection);
        }
    }

    private static void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private static String generateUniqueId(int authId) {
        return "EO" + authId;
    }

    private static void displayHomeScreen(int authId) {
        HomeScreen homeScreen = new HomeScreen(authId);
        homeScreen.setVisible(true);
    }

    private static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
