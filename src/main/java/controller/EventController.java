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

    // Fetch events for a specific organizerId
    public List<EventModel> getEventsByOrganizerId(String organizerId) {
        List<EventModel> eventsList = new ArrayList<>();
        String query = "SELECT eventId, eventName, eventDate, location, description, eventStatus "
                     + "FROM eventdetails WHERE organizorId = ?";

        try (Connection connection = DatabaseConnection.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, organizerId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                eventsList.add(mapResultSetToEvent(resultSet));
            }
        } catch (SQLException e) {
            System.err.println("Error while fetching events: " + e.getMessage());
        }

        return eventsList;
    }

    // Save event details into the database
    public boolean saveEvent(EventModel event, String organizerId) {
        String query = "INSERT INTO eventdetails (eventName, eventDate, location, description, organizorId, eventStatus) "
                     + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, event.getName());
            preparedStatement.setDate(2, parseDate(event.getDate()));
            preparedStatement.setString(3, event.getLocation());
            preparedStatement.setString(4, event.getDescription());
            preparedStatement.setString(5, organizerId);
            preparedStatement.setString(6, event.getEventStatus());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException | ParseException e) {
            System.err.println("Error while inserting event: " + e.getMessage());
            return false;
        }
    }

    private EventModel mapResultSetToEvent(ResultSet resultSet) throws SQLException {
        EventModel event = new EventModel();
        event.setId(resultSet.getString("eventId"));
        event.setName(resultSet.getString("eventName"));
        event.setDate(resultSet.getString("eventDate"));
        event.setLocation(resultSet.getString("location"));
        event.setDescription(resultSet.getString("description"));
        event.setEventStatus(resultSet.getString("eventStatus"));
        return event;
    }

    private Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date parsedDate = dateFormat.parse(dateString);
        return new Date(parsedDate.getTime());
    }
}
