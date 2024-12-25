package models;

public class EventModel {
    private String name;
    private String date; 
    private String location;
    private String description;
    private String eventStatus; 

    public EventModel() {
    }

    public EventModel( String name, String date, String location, String description, String eventStatus) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.description = description;
        this.eventStatus = eventStatus;
    }

 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }
}
