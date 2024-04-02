package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String userPassword="root";
        // get the connection object
        try(Connection connection = DriverManager.getConnection(url,userName,userPassword);
        // create a statement object
        Statement statement = connection.createStatement();) {
            // pass the sql query to be executed
            String sql = "create table employee(name varchar(20), employeeId int primary key, city varchar(20));";
            boolean result = statement.execute(sql);
            System.out.println("Table Created " + !result);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
