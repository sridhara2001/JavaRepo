package com.book.service;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.book.model.Book;
import com.book.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService {
    @Override
    public List<Book> getAll() {
        List<Book> books = BookDetails.showBooks();
        return books;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks();
        List<Book> booksByAuthor = new ArrayList<>();
        for(Book book : books){
            if (book.getAuthor().startsWith(author)){
                booksByAuthor.add(book);
            }
        }
        if (booksByAuthor.isEmpty()){
            throw new BookNotFoundException("Book by this author not found");
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks();
        List<Book> booksByCategory = new ArrayList<>();
        for(Book book : books){
            if (book.getCategory().startsWith(category)){
                booksByCategory.add(book);
            }
        }
        if (booksByCategory.isEmpty()){
            throw new BookNotFoundException("Book by this category not found");
        }
        return booksByCategory;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks();
        List<Book> booksByPrice = new ArrayList<>();
        for(Book book : books){
            if (book.getPrice()<price){
                booksByPrice.add(book);
            }
        }
        if (booksByPrice.isEmpty()){
            throw new BookNotFoundException("Book not found less than this price");
        }
        return booksByPrice;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books = BookDetails.showBooks();
        List<Book> booksByAuthorAndCategory = new ArrayList<>();
        for(Book book : books){
            if (book.getAuthor().startsWith(author) | book.getCategory().startsWith(category)){
                booksByAuthorAndCategory.add(book);
            }
        }
        if (booksByAuthorAndCategory.isEmpty()){
            throw new BookNotFoundException("Book Not Found");
        }
        return booksByAuthorAndCategory;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        List<Book> books = BookDetails.showBooks();
        for(Book book : books){
            if (book.getBookId()==bookId){
                return book;
            }
        }
        throw new IdNotFoundException("Invalid ID");
    }
}
