package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import models.EventOrganizorModel;
import resources.DatabaseConnection;

public class EventOrganizorController {

    public static boolean createEventOrganizor(String email, int authId, String id) {
        String insertQuery = "INSERT INTO EventOrganizor (organizorId, authId, email) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.connect(); PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            if (connection == null) {
                showErrorDialog("Database connection failed");
                return false;
            }

            // Set parameters for the query
            preparedStatement.setString(1, id);
            preparedStatement.setInt(2, authId);
            preparedStatement.setString(3, email);

            return preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            showErrorDialog("Error while inserting EventOrganizor: " + e.getMessage());
            return false;
        }
    }

    public static EventOrganizorModel getEventOrganizorDetails(int authId) {
        String query = "SELECT organizorId, email, assignedEvents FROM EventOrganizor WHERE authId = ?";

        try (Connection connection = DatabaseConnection.connect(); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            if (connection == null) {
                showErrorDialog("Database connection failed");
                return null;
            }

            preparedStatement.setInt(1, authId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return mapResultSetToEventOrganizor(resultSet);
                } else {
                    showInfoDialog("No details found for the provided authId");
                    return null;
                }
            }
        } catch (SQLException e) {
            showErrorDialog("Error while fetching details: " + e.getMessage());
            return null;
        }
    }

    private static EventOrganizorModel mapResultSetToEventOrganizor(ResultSet resultSet) throws SQLException {
        EventOrganizorModel organizor = new EventOrganizorModel();
        organizor.setId(resultSet.getString("organizorId"));
        organizor.setEmail(resultSet.getString("email"));
        organizor.setAssignedEvents(resultSet.getString("assignedEvents"));
        return organizor;
    }

    private static void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private static void showInfoDialog(String message) {
        JOptionPane.showMessageDialog(null, message, "Info", JOptionPane.INFORMATION_MESSAGE);
    }
}
