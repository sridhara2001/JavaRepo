package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Virat Kohli","Sridhar",1000);
        Book book2 = new Book("AB Devilliers","Prashanth",500);
        Book book3 = new Book("MS Dhoni","Adarsh",400);
        Book book4 = new Book("Maxwell","Chida",300);
        List<Book> books = Arrays.asList(book1,book2,book3,book4);

        for (Book book:books){
            System.out.println(book);
        }

        System.out.println("----------------------------------------------------");
        Collections.sort(books);

        for (Book book : books){
            System.out.println(book);
        }
    }
}
