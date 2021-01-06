package com.company.dao;

import com.company.entity.FlightsEntity;
import com.company.entity.PilotsEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

public class PilotsDao extends Dao<PilotsEntity> {
    private static final String SAVE_REQUEST = "insert into pilots (id, firstName, lastName, rank, code) Values (?, ?, ?, ?, ?)";

    @Override
    List<PilotsEntity> getAll() {
        return null;
    }

    @Override
    public void batchSave(List<PilotsEntity> entities) {
        Connection connection = connector.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_REQUEST);
            int rows = 0;
            for (PilotsEntity entity : entities) {

                preparedStatement.setInt(1, entity.getPilotsId());
                preparedStatement.setString(2, entity.getFirstName());
                preparedStatement.setString(3, entity.getLastName());
                preparedStatement.setInt(4, entity.getPilotRank());
                preparedStatement.setString(5, entity.getPilotCode());

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




