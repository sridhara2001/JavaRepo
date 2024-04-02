package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String userPassword="root";
        // get the connection object
        try(Connection connection = DriverManager.getConnection(url,userName,userPassword);
        // create a statement object
        Statement statement = connection.createStatement();) {
            // pass the sql query to be executed
            String sql = "insert into employee values('Sridhar',18,'Bengaluru')";
            boolean result = statement.execute(sql);
            System.out.println("Data Inserted " + !result);
            String sql1 = "insert into employee(name,employeeId,city) values('Likhith',7,'Shivmoga'),('Chida',10,'Tumkur');";
            boolean result1 = statement.execute(sql1);
            System.out.println("Data Inserted " + !result1);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
