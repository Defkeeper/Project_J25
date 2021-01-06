package com.company.csv.reader;
import com.company.entity.Entity;
import com.company.entity.PlanesEntity;
import java.util.List;


public class PlanesReader extends Reader<PlanesEntity> {
    private static final String FILE_NAME = "planes.csv";

    @Override
    public List<String> read() {
        return super.read(FILE_NAME);
    }

    @Override
    public PlanesEntity createEntity(String[] entityData) {
        int planeId = Integer.parseInt(entityData[0]);
        String brand = entityData[1];
        String model = entityData[2];
        int passengersQuantity = Integer.parseInt(entityData[3]);
        int boardNumber = Integer.parseInt(entityData[4]);

        return new PlanesEntity(planeId, brand, model, passengersQuantity, boardNumber);
    }
}

