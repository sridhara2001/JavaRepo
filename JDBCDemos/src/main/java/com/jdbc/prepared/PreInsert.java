package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/voyatraining";
        String userName="root";
        String userPassword="root";
        String sql = "insert into cab values(?,?,?,?,?,?)";

        try(
                Connection connection = DriverManager.getConnection(url,userName,userPassword);
                PreparedStatement statement = connection.prepareStatement(sql);
                ){
            Scanner scanner = new Scanner(System.in);
            for (int i=0; i<3; i++){
                System.out.println("Please Enter details");
                int cabNumber = scanner.nextInt();
                String drop = scanner.next();
                String pickup = scanner.next();
                String time = scanner.next();
                Time time1 = Time.valueOf(time);
                String date = scanner.next();
                Date date1 = Date.valueOf(date);
                String driverName = scanner.next();


                // assign values to placeholders
                statement.setInt(1,cabNumber);
                statement.setString(2,drop);
                statement.setString(3,pickup);
                statement.setTime(4,time1);
                statement.setDate(5, date1);
                statement.setString(6,driverName);
                System.out.println(statement.execute());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
