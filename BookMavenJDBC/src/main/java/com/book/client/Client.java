package com.book.client;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.book.model.Book;
import com.book.service.BookServiceImpl;
import com.book.service.IBookService;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        IBookService bookService = new BookServiceImpl();
        Book book1 = new Book("Messi","Likhith","Football",10,1100);

        bookService.addBook(book1);

        System.out.println();
        System.out.println("All Books");
        List<Book> books = bookService.getAll();
        for (Book book : books){
            System.out.println(book);
        }
        System.out.println();
        System.out.println("Update Operation");

        bookService.updateBook(18,1600);

        System.out.println();
        System.out.println("Delete Operation");

        bookService.deleteBook(12);

        System.out.println();
        System.out.println("Finding Book using id");

        try {
            Book book = bookService.getById(18);
            System.out.println(book);
        } catch (IdNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.println("Finding Book using author");

        try {
            books = bookService.getByAuthorContains("i");
            for (Book book : books){
                System.out.println(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Finding Book using category");

        try {
            books = bookService.getByCategory("Cricket");
            for (Book book : books){
                System.out.println(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Finding Book using author and category");

        try {
            books = bookService.getByAuthorContainsAndCategory("i","Cricket");
            for (Book book : books){
                System.out.println(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Finding Book by less price");

        try {
            books = bookService.getByPriceLessThan(800);
            for (Book book : books){
                System.out.println(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
