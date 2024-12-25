package controller;

import models.EventModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import resources.DatabaseConnection;

public class EventController {
     // Method to fetch events for a specific organizerId
    public List<EventModel> getEventsByOrganizerId(String organizerId) {
        // List to store the events fetched from the database
        List<EventModel> eventsList = new ArrayList<>();

        // SQL query to fetch events by organizerId
        String query = "SELECT eventId, eventName, eventDate, location, description, eventStatus "
                     + "FROM eventdetails WHERE organizorId = ?";

        // Use the existing DB connection from DatabaseConnection class
        try (Connection connection = DatabaseConnection.connect();  // Get the connection from DBConnection
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Set the organizerId parameter in the SQL query
            preparedStatement.setString(1, organizerId);

            // Execute the query and get the result set
            ResultSet resultSet = preparedStatement.executeQuery();

            // Iterate through the result set and map each row to an EventModel object
            while (resultSet.next()) {
                // Create a new EventModel object for each event
                EventModel event = new EventModel();
                event.setId(resultSet.getString("eventId"));
                event.setName(resultSet.getString("eventName"));
                event.setDate(resultSet.getString("eventDate"));
                event.setLocation(resultSet.getString("location"));
                event.setDescription(resultSet.getString("description"));
                event.setEventStatus(resultSet.getString("eventStatus"));

                // Add the event to the list
                eventsList.add(event);
            }
        } catch (SQLException e) {
            // Handle any SQL exceptions
            System.out.println("Error while fetching events: " + e.getMessage());
        }

        // Return the list of events
        return eventsList;
    }

    // Method to insert event details into the database
    public boolean saveEvent(EventModel event,String organizorId) {
        // SQL query to insert event details into the eventdetails table
        String query = "INSERT INTO eventdetails ( eventName, eventDate, location, description, organizorId, eventStatus) "
                     + "VALUES ( ?, ?, ?, ?, ?, ?)";

        // Use the existing DB connection from DBConnection class
        try (Connection connection = DatabaseConnection.connect();  // Get the connection from DBConnection
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Parse the eventDate to the correct format (YYYY-MM-DD)
            String eventDateString = event.getDate();  // Assuming event.getDate() returns the date as "DD-MM-YYYY"
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date parsedDate = dateFormat.parse(eventDateString);
            java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());

            // Set the parameters for the SQL query
            preparedStatement.setString(1, event.getName());  // Event Name
            preparedStatement.setDate(2, sqlDate);  // Event Date (converted to SQL Date)
            preparedStatement.setString(3, event.getLocation());  // Event Location
            preparedStatement.setString(4, event.getDescription());  // Event Description
            preparedStatement.setString(5, organizorId);  // Organize ID, hardcoded as EO4 for now
            preparedStatement.setString(6, event.getEventStatus());  // Event Status

            // Execute the insert query
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if the event was successfully inserted
            return rowsAffected > 0;  // Return true if rows were affected, meaning insertion was successful
        } catch (SQLException | ParseException e) {
            // Handle SQL exceptions and date parsing exceptions
            System.out.println("Error while inserting event: " + e.getMessage());
            return false;  // Return false if there was an error during insertion
        }
    }
    
    
}
