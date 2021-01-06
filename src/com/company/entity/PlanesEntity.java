package com.company.entity;

public class PlanesEntity extends Entity {
    private int planeId;
    private String brand;
    private String model;
    private int passengersQuantity;
    private int boardNumber;

    public PlanesEntity(int planeId, String brand, String model, int passengersQuantity, int boardNumber) {
        this.planeId = planeId;
        this.brand = brand;
        this.model = model;
        this.passengersQuantity = passengersQuantity;
        this.boardNumber = boardNumber;
    }
    public int getPlaneId() {
        return planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
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

    public int getBoardNumber() {
        return boardNumber;
    }

    public void setBoardNumber(int boardNumber) {
        this.boardNumber = boardNumber;
    }

    @Override
    public String toString() {
        return "PlanesEntity{" +
                "planeId=" + planeId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", passengersQuantity=" + passengersQuantity +
                ", boardNumber=" + boardNumber +
                '}';
    }
}

