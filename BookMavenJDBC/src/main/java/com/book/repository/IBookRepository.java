package com.book.repository;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.book.model.Book;

import java.util.List;

public interface IBookRepository {
    // same as IBookService but findByAuthor instead of getByAuthor
    void addBook(Book book);
    void updateBook(int bookId, double price);
    void deleteBook(int bookId);
    Book findById(int bookId) throws IdNotFoundException;

    List<Book> findAll();
    List<Book> findByAuthorContains(String author) throws BookNotFoundException;
    List<Book> findByPriceLessThan(double price) throws BookNotFoundException;
    List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;

    List<Book> findByCategory(String category) throws BookNotFoundException;
}
