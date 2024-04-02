package com.api.serial;

import java.io.FileReader;
import java.io.FileWriter;

public class TryWithResourcesDemo {
    public static void main(String[] args) {

        try(FileWriter fileWriter = new FileWriter("trial1.txt");
            FileReader fileReader = new FileReader("demo.txt");
            ) {
            int num = fileReader.read();
            fileWriter.write((char)num);
            do {
                num = fileReader.read();
                fileWriter.write((char)num);
            }while (num!=-1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
