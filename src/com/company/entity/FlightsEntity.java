package com.company.entity;

public class FlightsEntity extends Entity {
    private int flightId;
    private int pilot;
    private int plane;
    private String dateTime;
    private int flightNumber;

    public FlightsEntity(int flightId, int pilot, int plane, String dateTime, int flightNumber) {
        this.flightId = flightId;
        this.pilot = pilot;
        this.plane = plane;
        this.dateTime = dateTime;
        this.flightNumber = flightNumber;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getPilot() {
        return pilot;
    }

    public void setPilot(int pilot) {
        this.pilot = pilot;
    }

    public int getPlane() {
        return plane;
    }

    public void setPlane(int plane) {
        this.plane = plane;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "FlightsEntity{" +
                "flightId=" + flightId +
                ", pilot='" + pilot + '\'' +
                ", plane='" + plane + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                '}';
    }

}
