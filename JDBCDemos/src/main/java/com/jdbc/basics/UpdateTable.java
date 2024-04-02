package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String userPassword="root";
        // get the connection object
        try(Connection connection = DriverManager.getConnection(url,userName,userPassword);
        // create a statement object
        Statement statement = connection.createStatement();) {
            // pass the sql query to be executed
            String sql = "update employee set employeeId=17 where city='Bengaluru'";
            String sql1 = "delete from employee where city='Bengaluru'";
            boolean result = statement.execute(sql);
            System.out.println("Table Updated " + !result);
            boolean result1 = statement.execute(sql1);
            System.out.println("Column Deleted " + !result1);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
