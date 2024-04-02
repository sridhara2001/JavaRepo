package com.util.set;

import com.list.custom.Book;

import java.util.*;

public class BookSetDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Virat Kohli","Sridhar",1000);
        Book book5 = new Book("Virat Kohli","Sridhar",1000);
        Book book2 = new Book("AB Devilliers","Prashanth",500);
        Book book3 = new Book("MS Dhoni","Adarsh",400);
        Book book4 = new Book("Maxwell","Chida",300);
        List<Book> books = Arrays.asList(book1,book2,book3,book4,book5);

//        System.out.println("List Book");
//        for (Book book:books){
//            System.out.println(book);
//        }
//        System.out.println();
//        System.out.println("Set Books");
//        System.out.println();
        System.out.println("LinkedHashSet :");
        Set<Book> bookSet = new LinkedHashSet<>(books);
        for (Book book:bookSet){
            System.out.println(book);
        }

        System.out.println();
        System.out.println("Tree Set :");
        Set<Book> bookSet1 = new TreeSet<>(books);
        for (Book book:bookSet1){
            System.out.println(book);
        }
    }
}
