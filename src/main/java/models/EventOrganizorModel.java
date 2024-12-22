package models;

import java.util.*;

/**
 *
 * @author Nafeesa Yousaf
 */
public class EventOrganizorModel {

    private String id;
    private int authId;
    private String name;
    private String email;
    private int contactNumber;
    private String organizationName;
    private List assignedEvents;

    public EventOrganizorModel(String id, int authId, String name, String email, int contactNumber, String organizationName, List assignedEvents) {
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
    // Getter and Setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter for authId
    public int getAuthId() {
        return authId;
    }

    public void setAuthId(int authId) {
        this.authId = authId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for contactNumber
    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Getter and Setter for organizationName
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    // Getter and Setter for assignedEvents
    public List getAssignedEvents() {
        return assignedEvents;
    }

    public void setAssignedEvents(List assignedEvents) {
        this.assignedEvents = assignedEvents;
    }
}
