package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String userPassword="root";
        String sql = "update cab set driver_name=? where cab_number=?";

        try(
                Connection connection = DriverManager.getConnection(url,userName,userPassword);
                PreparedStatement statement = connection.prepareStatement(sql);
                Scanner scanner = new Scanner(System.in);
                ){
                System.out.println("Please Enter details to update");

                String driverName = scanner.next();
                int cabNumber = scanner.nextInt();

                // assign values to placeholders
                statement.setString(1,driverName);
                statement.setInt(2,cabNumber);

                System.out.println(statement.execute());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
