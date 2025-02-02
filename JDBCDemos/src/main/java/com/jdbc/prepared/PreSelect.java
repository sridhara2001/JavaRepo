package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PreSelect {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String userPassword="root";
        String sql = "select * from cab;";

        try(
                Connection connection = DriverManager.getConnection(url,userName,userPassword);
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery(sql);
                Scanner scanner = new Scanner(System.in);
                ){
                System.out.println("Cab Table");

                while(resultSet.next()){
                    int cabNo = resultSet.getInt("cab_number");
                    String dropLoc = resultSet.getString("drop_loc");
                    String pickupLoc = resultSet.getString("pickup_loc");
                    Time time = resultSet.getTime("pickup_time");
                    LocalTime pickupTime = LocalTime.parse(time.toString());
                    LocalDate pickupDate = LocalDate.parse(resultSet.getDate("pickup_date").toString());
                    String driverName = resultSet.getString("driver_name");

                    System.out.println(cabNo+" -- "+dropLoc+" -- "+pickupLoc+" -- "+pickupTime+" -- "+pickupDate+" -- "+driverName);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
