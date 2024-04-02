package com.api.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo{
    public static void main(String[] args) {
        Student student = new Student("Sridhar",18,"ECE");
        System.out.println("Serializing");

        try(
        FileOutputStream fileOutputStream = new FileOutputStream("stud.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ){
            objectOutputStream.writeObject(student);
            System.out.println("Completed");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
