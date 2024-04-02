package com.book.service;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.book.model.Book;
import com.book.repository.BookRepositoryImpl;
import com.book.repository.IBookRepository;

import java.util.List;

public class BookServiceImpl implements IBookService {

    private IBookRepository bookRepository = new BookRepositoryImpl();
    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public void updateBook(int bookId, double price) {
        bookRepository.updateBook(bookId,price);
    }

    public void deleteBook(int bookId) {
        bookRepository.deleteBook(bookId);
    }

    public List<Book> getAll() {
        List<Book> books = bookRepository.findAll();
        return books;
    }

    public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
        List<Book> books = bookRepository.findByAuthorContains(author);
        if (books.isEmpty()){
            throw new BookNotFoundException("Book not found with this author");
        }
        return books;
    }

    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books = bookRepository.findByCategory(category);
        if (books.isEmpty()){
            throw new BookNotFoundException("Book not found with this category");
        }
        return books;
    }

    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books = bookRepository.findByPriceLessThan(price);
        if (books.isEmpty()){
            throw new BookNotFoundException("Book not found less than this price");
        }
        return books;
    }

    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books = bookRepository.findByAuthorContainsAndCategory(author,category);
        if (books.isEmpty()){
            throw new BookNotFoundException("Book not found with this author and category");
        }
        return books;
    }

    public Book getById(int bookId) throws IdNotFoundException {
        Book book = bookRepository.findById(bookId);
        if (book==null){
            throw new IdNotFoundException("Book id not found");
        }
        return book;
    }
}
