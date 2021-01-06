package com.company.entity;

public class PilotsEntity extends Entity {
    int pilotsId;
    String firstName;
    String lastName;
    int pilotRank;
    String pilotCode;

    public PilotsEntity(int pilotsId, String firstName, String lastName, int pilotRank, String pilotCode) {
        this.pilotsId = pilotsId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pilotRank = pilotRank;
        this.pilotCode = pilotCode;
    }

    public int getPilotsId() {
        return pilotsId;
    }

    public void setPilotsId(int pilotsId) {
        this.pilotsId = pilotsId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPilotRank() {
        return pilotRank;
    }

    public void setPilotRank(int pilotRank) {
        this.pilotRank = pilotRank;
    }

    public String getPilotCode() {
        return pilotCode;
    }

    public void setPilotCode(String pilotCode) {
        this.pilotCode = pilotCode;
    }

    @Override
    public String toString() {
        return "PilotsEntity{" +
                "pilotsId=" + pilotsId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pilotRank=" + pilotRank +
                ", pilotCode='" + pilotCode + '\'' +
                '}';
    }
}
