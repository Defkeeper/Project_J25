package com.company.csv.reader;

import com.company.entity.Entity;
import com.company.entity.PilotsEntity;
import java.util.List;


public class PilotsReader extends Reader<PilotsEntity> {

    private static final String FILE_NAME = "pilots.csv";

    @Override
    public List<String> read() {
        return super.read(FILE_NAME);
    }

    @Override
    public PilotsEntity createEntity(String[] entityData) {
        int pilotsId = Integer.parseInt(entityData[0]);
        String firstName = entityData[1];
        String lastName = entityData[2];
        int pilotRank = Integer.parseInt(entityData[3]);
        String pilotCode = entityData[4];

        return new PilotsEntity(pilotsId, firstName, lastName, pilotRank, pilotCode);
    }
}

