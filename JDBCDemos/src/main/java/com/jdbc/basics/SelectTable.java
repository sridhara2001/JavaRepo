package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String userPassword = "root";
        // get the connection object
        String sql = "select * from employee where driver_name=?";
        try (Connection connection = DriverManager.getConnection(url, userName, userPassword);
             // create a statement object
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);) {
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int employeeId = resultSet.getInt("employeeId");
                String city = resultSet.getString("city");
                System.out.println(name + "\t" + employeeId + "\t" + city);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
