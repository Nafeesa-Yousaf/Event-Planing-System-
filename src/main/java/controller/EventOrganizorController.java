/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.sql.*;
import javax.swing.JOptionPane;
import models.EventOrganizorModel;
import resources.DatabaseConnection;

public class EventOrganizorController {

    // Method to create a new EventOrganizor record after user registration
    public static boolean createEventOrganizor(String email, int authId, String id) {
        // Establishing database connection
        Connection connection = DatabaseConnection.connect();

        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // SQL query to insert the new EventOrganizor data
        String insertQuery = "INSERT INTO EventOrganizor (organizorId, authId, email) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            // Set the parameters for the query
            preparedStatement.setString(1, id);  // Unique ID for the EventOrganizor
            preparedStatement.setInt(2, authId); // The authId from the users table (foreign key)
            preparedStatement.setString(3, email); // The email of the user (EventOrganizor)

            // Execute the query and check if the record was inserted
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                return true; // Record inserted successfully
            } else {
                return false; // Insertion failed
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error while inserting EventOrganizor: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Return false in case of any exception
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
    
     // Method to fetch EventOrganizor details by authId
    public static EventOrganizorModel getEventOrganizorDetails(int authId) {
        // Establish database connection
        Connection connection = DatabaseConnection.connect();

        if (connection == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        // SQL query to fetch details from EventOrganizor table
        String query = "SELECT organizorId, email, assignedEvents FROM EventOrganizor WHERE authId = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            // Set the authId parameter
            preparedStatement.setInt(1, authId);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if a record is found
            if (resultSet.next()) {
                // Populate EventOrganizorModel with fetched data
                EventOrganizorModel organizor = new EventOrganizorModel();
                organizor.setId(resultSet.getString("organizorId"));
                organizor.setEmail(resultSet.getString("email"));
                organizor.setAssignedEvents(resultSet.getString("assignedEvents"));

                return organizor; // Return the populated model
            } else {
                JOptionPane.showMessageDialog(null, "No details found for the provided authId", "Info", JOptionPane.INFORMATION_MESSAGE);
                return null; // No record found
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error while fetching details: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null; // Return null in case of an error
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
}

