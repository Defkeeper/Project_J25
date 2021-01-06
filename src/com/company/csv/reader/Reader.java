package com.company.csv.reader;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Reader<T> {
    private static final String FILE_PATH = "D:\\Java\\IntelliJ IDEA Community Edition 2020.1.3\\Project_J25\\DB\\data\\";

    protected abstract List<String> read();

    protected abstract T createEntity(String[] entityData);

    protected List<String> read(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH + fileName))) {
            lines = br.lines().collect(Collectors.toList());
        } catch (IOException ex) {
            System.out.println("Critical error: unable to open data files. Application closed");
            System.exit(0);
        }
        return lines;
    }

    protected List<T> parse(List<String> data) {
        List<T> result = new ArrayList<>();

        for (String line : data) {
            String[] entityData = line.split(";");
            T entity = createEntity(entityData);
            result.add(entity);
        }

        return result;
    }

    public List<T> readEntity() {
        return parse(read());
    }
}
