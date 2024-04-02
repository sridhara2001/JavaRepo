package com.book.service;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.book.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAll();
    List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException;
    List<Book> getByCategory(String category) throws BookNotFoundException;
    List<Book> getByPriceLessThan(double price) throws BookNotFoundException;
    List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;
    Book getById(int bookId) throws IdNotFoundException;

}
