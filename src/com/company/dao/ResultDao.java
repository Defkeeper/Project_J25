package com.company.dao;

import com.company.entity.PlanesEntity;
import com.company.entity.ResultEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ResultDao extends Dao<ResultEntity> {
    private String SELECT_REQUEST = "SELECT number, dt, board_number, brand," +
            " model, passengers_quantity, firstname, lastname, code, rank " +
            "FROM pilots, planes, flights WHERE flights.pilot = pilots.id AND flights.plane = planes.id";

    @Override
    public List<ResultEntity> getAll() {

        Connection connection = connector.getConnection();
        List<ResultEntity> resultEntities = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_REQUEST);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ResultEntity resultEntity = new ResultEntity();
                String number = resultSet.getString("number");
                String dateTime = resultSet.getString("dt");
                int boardNumber = resultSet.getInt("board_number");
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                int passengersQuantity = resultSet.getInt("passengers_quantity");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                lastName = Character.toString(lastName.charAt(0));
                int pilotRank = resultSet.getInt("rank");
                String pilotCode = resultSet.getString("code");

                resultEntity.setFlightNumber(number);
                resultEntity.setDateTime(dateTime);
                resultEntity.setBoardNumber(boardNumber);
                resultEntity.setBrand(brand);
                resultEntity.setModel(model);
                resultEntity.setPassengersQuantity(passengersQuantity);
                resultEntity.setFirstName(firstName);
                resultEntity.setLastName(lastName);
                resultEntity.setPilotRank(pilotRank);
                resultEntity.setPilotCode(pilotCode);

                resultEntities.add(resultEntity);
            }
        } catch (Exception exception) {
            System.out.println(exception + "Connection failed...");
        } finally {
            connector.closeConnection(connection);
        }
        return resultEntities;
    }

    @Override
    void batchSave(List<ResultEntity> entities) {

    }
}
