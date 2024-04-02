package com.book.client;

import com.book.exception.BookNotFoundException;
import com.book.model.Book;
import com.book.service.BookServiceImpl;
import com.book.service.IBookService;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book category to find book");
        String bookCategory = sc.next();
        IBookService bookService = new BookServiceImpl();
        List<Book> booksByCategory;
        try {
            booksByCategory = bookService.getByCategory(bookCategory);
            for (Book book : booksByCategory){
                System.out.println(book);
            }
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
