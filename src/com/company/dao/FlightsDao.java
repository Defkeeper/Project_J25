package com.company.dao;

import com.company.entity.FlightsEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

public class FlightsDao extends Dao<FlightsEntity> {
    private static final String SAVE_REQUEST = "insert into flights (id, pilot, plane, dt, number) Values (?, ?, ?, ?, ?)";

    @Override
    List<FlightsEntity> getAll() {
        return null;
    }

    @Override
    public void batchSave(List<FlightsEntity> entities) {
        Connection connection = connector.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_REQUEST);
            int rows = 0;
            for (FlightsEntity entity : entities) {

                preparedStatement.setInt(1, entity.getFlightId());
                preparedStatement.setInt(2, entity.getPilot());
                preparedStatement.setInt(3, entity.getPlane());
                preparedStatement.setString(4, entity.getDateTime());
                preparedStatement.setInt(5, entity.getFlightNumber());

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
