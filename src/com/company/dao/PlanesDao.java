package com.company.dao;

import com.company.entity.FlightsEntity;
import com.company.entity.PlanesEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

public class PlanesDao extends Dao<PlanesEntity> {
    private static final String SAVE_REQUEST = "insert into planes (id, brand, model, passengers_quantity, board_number) Values (?, ?, ?, ?, ?)";

    @Override
    List<PlanesEntity> getAll() {
        return null;
    }

    @Override
    public void batchSave(List<PlanesEntity> entities) {
        Connection connection = connector.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_REQUEST);
            int rows = 0;
            for (PlanesEntity entity : entities) {

                preparedStatement.setInt(1, entity.getPlaneId());
                preparedStatement.setString(2, entity.getBrand());
                preparedStatement.setString(3, entity.getModel());
                preparedStatement.setInt(4, entity.getPassengersQuantity());
                preparedStatement.setInt(5, entity.getBoardNumber());

                rows += preparedStatement.executeUpdate();
            }
            System.out.printf("%d rows added \n", rows);
        } catch (Exception exception) {
            System.out.println(exception + "Connection failed...");
        } finally {
            connector.closeConnection(connection);
        }
    }
}


