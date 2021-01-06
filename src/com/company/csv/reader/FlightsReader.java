package com.company.csv.reader;

import com.company.entity.Entity;
import com.company.entity.FlightsEntity;

import java.util.List;

public class FlightsReader extends Reader <FlightsEntity>{
    private static final String FILE_NAME = "flights.csv";

    @Override
    protected List<String> read() {
        return super.read(FILE_NAME);
    }

    @Override
    protected FlightsEntity createEntity(String[] entityData) {
        int flightId = Integer.parseInt(entityData[0]);
        int pilot = Integer.parseInt(entityData[1]);
        int plane = Integer.parseInt(entityData[2]);
        String dateTime = entityData[3];
        int flightNumber = Integer.parseInt(entityData[4]);

        return new FlightsEntity(flightId, pilot, plane, dateTime, flightNumber);
    }
}