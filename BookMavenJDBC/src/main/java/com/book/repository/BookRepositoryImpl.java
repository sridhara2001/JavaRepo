package com.book.repository;

import com.book.exception.BookNotFoundException;
import com.book.exception.IdNotFoundException;
import com.book.model.Book;
import com.book.util.BookDb;
import com.book.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements IBookRepository {

    public void addBook(Book book) {
        try (Connection connection = BookDb.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
             ){
            statement.setString(1, book.getTitle());
            statement.setString(2,book.getAuthor());
            statement.setString(3,book.getCategory());
            statement.setInt(4,book.getBookId());
            statement.setDouble(5,book.getPrice());
            statement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateBook(int bookId, double price) {
        try (Connection connection = BookDb.openConnection();
                PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY)){
                statement.setDouble(1,price);
                statement.setInt(2,bookId);
                int result = statement.executeUpdate();
                System.out.println(result+" updated");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteBook(int bookId) {
        try(Connection connection = BookDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY))   {
            statement.setInt(1,bookId);

            int result = statement.executeUpdate();
            System.out.println(result+" deleted");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Book findById(int bookId) throws IdNotFoundException {
        Book book = null;
        try(Connection connection = BookDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYID)){
            statement.setInt(1,bookId);
            try(ResultSet resultSet = statement.executeQuery();){
                while (resultSet.next()){
                    String title = resultSet.getString("title");
                    String author = resultSet.getString("author");
                    String category = resultSet.getString("category");
                    double price = resultSet.getDouble("price");

                    book = new Book(title,author,category,bookId,price);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return book;
    }

    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        try(Connection connection = BookDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
            ResultSet resultset = statement.executeQuery();){
            while (resultset.next()){
                String title = resultset.getString("title");
                String author = resultset.getString("author");
                String category = resultset.getString("category");
                int bookId = resultset.getInt("book_id");
                double price = resultset.getDouble("price");
                Book book = new Book(title,author,category,bookId,price);
                bookList.add(book);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return bookList;
    }

    public List<Book> findByAuthorContains(String author) throws BookNotFoundException {
        List<Book> books = new ArrayList<>();
        try(Connection connection = BookDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYAUTHOR);
        ){
            statement.setString(1,"%"+author+"%");
            try(ResultSet resultSet = statement.executeQuery();
            ){
                while (resultSet.next()){
                    String title = resultSet.getString("title");
                    String author1 = resultSet.getString("author");
                    String category = resultSet.getString("category");
                    int bookId = resultSet.getInt("book_id");
                    double price = resultSet.getDouble("price");
                    Book book = new Book(title,author1,category,bookId,price);
                    books.add(book);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return books;
    }

    public List<Book> findByPriceLessThan(double price) throws BookNotFoundException {
        List<Book> books = new ArrayList<>();
        try(Connection connection = BookDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYPRICE);
        ){
            statement.setDouble(1,price);
            try(ResultSet resultSet = statement.executeQuery();
            ){
                while (resultSet.next()){
                    String title = resultSet.getString("title");
                    String author = resultSet.getString("author");
                    String category = resultSet.getString("category");
                    int bookId = resultSet.getInt("book_id");
                    double price1 = resultSet.getDouble("price");
                    Book book = new Book(title,author,category,bookId,price1);
                    books.add(book);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return books;
    }

    public List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
        List<Book> books = new ArrayList<>();
        try(Connection connection = BookDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYAUTHORANDCATEGORY);
        ){
            statement.setString(1,category);
            statement.setString(2,"%"+author+"%");
            try(ResultSet resultSet = statement.executeQuery();
            ){
                while (resultSet.next()){
                    String title = resultSet.getString("title");
                    String author1 = resultSet.getString("author");
                    String category1 = resultSet.getString("category");
                    int bookId = resultSet.getInt("book_id");
                    double price = resultSet.getDouble("price");
                    Book book = new Book(title,author1,category1,bookId,price);
                    books.add(book);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return books;
    }

    public List<Book> findByCategory(String category) throws BookNotFoundException {
        List<Book> books = new ArrayList<>();
        try(Connection connection = BookDb.openConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.FINDBYCATEGORY);
        ){
            statement.setString(1,category);
            try(ResultSet resultSet = statement.executeQuery();
            ){
                while (resultSet.next()){
                    String title = resultSet.getString("title");
                    String author = resultSet.getString("author");
                    int bookId = resultSet.getInt("book_id");
                    double price = resultSet.getDouble("price");
                    Book book = new Book(title,author,category,bookId,price);
                    books.add(book);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return books;
    }
}
