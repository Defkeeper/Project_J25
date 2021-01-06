package com.company.dao;

import com.company.connector.Connector;

import java.util.List;

public abstract class Dao<T> {
    protected Connector connector = new Connector();

    abstract List<T> getAll();

    abstract void batchSave(List<T> entities);

}
