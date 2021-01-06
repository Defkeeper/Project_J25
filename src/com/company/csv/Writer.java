package com.company.csv;

import com.company.entity.ResultEntity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {
    private static final String FILE_PATH = "D:\\Java\\IntelliJ IDEA Community Edition 2020.1.3\\Project_J25\\DB\\data\\";

    public void write(List<ResultEntity> resultEntities) {
        try (FileWriter writer = new FileWriter(FILE_PATH + "result.csv")) {
            for (ResultEntity resultEntity : resultEntities) {
                writer.write(resultEntity.toString() + "\n");
                writer.flush();
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
