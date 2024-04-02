package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreCreate {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String userPassword="root";
        String sql = "create table cab(cab_number int primary key, drop_loc varchar(20), pickup_loc varchar(20), pickup_time time, pickup_date date, driver_name varchar(20));";

        try(
                Connection connection = DriverManager.getConnection(url,userName,userPassword);
                PreparedStatement statement = connection.prepareStatement(sql);
                ){
            boolean result = statement.execute();
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
