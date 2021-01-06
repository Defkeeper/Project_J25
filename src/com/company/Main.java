package com.company;

import com.company.csv.Writer;
import com.company.csv.reader.FlightsReader;
import com.company.csv.reader.PilotsReader;
import com.company.csv.reader.PlanesReader;
import com.company.dao.FlightsDao;
import com.company.dao.PilotsDao;
import com.company.dao.PlanesDao;
import com.company.dao.ResultDao;
import com.company.entity.FlightsEntity;
import com.company.entity.PilotsEntity;
import com.company.entity.PlanesEntity;
import com.company.entity.ResultEntity;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlightsReader flightsReader = new FlightsReader();
        List<FlightsEntity> flightsEntities = flightsReader.readEntity();

        FlightsDao flightsDao = new FlightsDao();
        flightsDao.batchSave(flightsEntities);

        PilotsReader pilotsReader = new PilotsReader();
        List<PilotsEntity> pilotsEntities = pilotsReader.readEntity();

        PilotsDao pilotsDao = new PilotsDao();
        pilotsDao.batchSave(pilotsEntities);


        PlanesReader planesReader = new PlanesReader();
        List<PlanesEntity> planesEntities = planesReader.readEntity();

        PlanesDao planesDao = new PlanesDao();
        planesDao.batchSave(planesEntities);

        ResultDao resultDao = new ResultDao();
        List<ResultEntity> resultEntities = resultDao.getAll();

        for(ResultEntity resultEntity : resultEntities){
            System.out.println(resultEntity.toString() + "\n");
        }
        Writer writer = new Writer();
        writer.write(resultEntities);
    }
}
