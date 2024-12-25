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

    // Method to register a new user
    public static boolean registerUser(AuthenticationModel authModel) {
        // Establishing database connection
        Connection connection = DatabaseConnection.connect();

        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // SQL query to check if the email already exists
        String checkEmailQuery = "SELECT COUNT(*) FROM users WHERE email = ?";

        try (PreparedStatement checkEmailStmt = connection.prepareStatement(checkEmailQuery)) {
            checkEmailStmt.setString(1, authModel.getEmail());

            // Execute the query and check if the email exists
            ResultSet resultSet = checkEmailStmt.executeQuery();

            if (resultSet.next() && resultSet.getInt(1) > 0) {
                // Email is already registered
                JOptionPane.showMessageDialog(null, "User already registered with the same email", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // SQL query to insert user data into the users table
            String insertQuery = "INSERT INTO users (email, password, role) VALUES (?, ?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, authModel.getEmail());
                preparedStatement.setString(2, authModel.getPassword());
                preparedStatement.setString(3, authModel.getRole());

                // Execute the query and get the generated keys (authId)
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    // Get the generated user ID (authId)
                    ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        int authId = generatedKeys.getInt(1); // Get the generated authId
                        String id = "EO" + authId; // Example: Create a unique ID for EventOrganizor (you can modify this logic)

                        // Now call EventOrganizorController to add the user to EventOrganizor table
                        boolean isCreated = EventOrganizorController.createEventOrganizor(authModel.getEmail(), authId, id);
                        if (isCreated) {
                            return true; // User and EventOrganizor created successfully
                        } else {
                            return false; // EventOrganizor creation failed
                        }
                    }
                }
                return false; // If user creation fails

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error while inserting user: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error while checking email: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close(); // Close the connection
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing connection: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static boolean authenticateUser(AuthenticationModel authModel) {
        // Establishing database connection
        Connection connection = DatabaseConnection.connect();

        if (connection == null) {
            return false; // Return false if the connection failed
        }

        // SQL query to check if the user exists in the database
        String query = "SELECT * FROM users WHERE email = ? AND password = ? AND role = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            // Set the parameters for the query
            preparedStatement.setString(1, authModel.getEmail());
            preparedStatement.setString(2, authModel.getPassword());
            preparedStatement.setString(3, authModel.getRole());

            // Execute the query and get the result
            ResultSet resultSet = preparedStatement.executeQuery();

            // If a user is found, return true (authentication successful)
            if (resultSet.next()) {
                int authId = resultSet.getInt("id"); // Get the authId from the result set
                HomeScreen homeScreen = new HomeScreen(authId);
                homeScreen.setVisible(true);
                return true; // Authentication successful
            }

            // If no matching user is found, return false (authentication failed)
            return false;
        } catch (SQLException e) {
            e.printStackTrace(); // Print the stack trace for debugging
            return false; // Return false in case of any exception
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close(); // Close the connection
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Print stack trace for connection closing issues
            }
        }
    }
}
