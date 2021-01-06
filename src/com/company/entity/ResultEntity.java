package com.company.entity;

public class ResultEntity extends Entity {
    String flightNumber;
    String dateTime;
    int boardNumber;
    String brand;
    String model;
    int passengersQuantity;
    String firstName;
    String lastName;
    int pilotRank;
    String pilotCode;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getBoardNumber() {
        return boardNumber;
    }

    public void setBoardNumber(int boardNumber) {
        this.boardNumber = boardNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengersQuantity() {
        return passengersQuantity;
    }

    public void setPassengersQuantity(int passengersQuantity) {
        this.passengersQuantity = passengersQuantity;
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
        return flightNumber +"|"+ dateTime +"|"+ boardNumber +"|"+ brand +" "+ model +"|"+ passengersQuantity
                +"|"+ firstName +"|"+ lastName +"|"+ pilotCode +"("+ pilotRank +")" ;
    }
}
