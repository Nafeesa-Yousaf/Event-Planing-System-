package models;

public class EventOrganizorModel {

    private String id;
    private int authId;
    private String name;
    private String email;
    private int contactNumber;
    private String organizationName;
    private String assignedEvents;

    public EventOrganizorModel(String id, int authId, String name, String email, int contactNumber, String organizationName, String assignedEvents) {
        this.id = id;
        this.authId = authId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.organizationName = organizationName;
        this.assignedEvents = assignedEvents;
    }

    public EventOrganizorModel() {
    }

    ;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAuthId() {
        return authId;
    }

    public void setAuthId(int authId) {
        this.authId = authId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getAssignedEvents() {
        return assignedEvents;
    }

    public void setAssignedEvents(String assignedEvents) {
        this.assignedEvents = assignedEvents;
    }
}
