package com.company.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost/ap?serverTimezone=Europe/Minsk", "root", "dankomoda1488");
            return connection;
        } catch (Exception ex) {
            System.out.println("Connection failed!");
            System.out.println(ex);
        }
        return null;
    }

    public void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (Exception ex) {
            System.out.println("Error: Unable to close connection");
        }

    }
}
