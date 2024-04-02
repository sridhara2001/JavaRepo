package com.book.util;

import com.book.model.Book;

import java.util.Arrays;
import java.util.List;

public class BookDetails {
    public static List<Book> showBooks(){
        return Arrays.asList(
                new Book("Virat Kohli","Sridhar","Cricket",18,1000),
                new Book("AB Devilliers","Prashanth","Hockey",17,500),
                new Book("MS Dhoni","Adarsh","Football",7,600),
                new Book("Maxwell","Chida","Golf",32,400),
                new Book("Rajath","Sridhar","Cricket",19,400)
        );
    }
}
