package com.book.util;

public class Queries {
    public static final String INSERTQUERY = "insert into book values(?,?,?,?,?)";
    public static final String UPDATEQUERY = "update book set price=? where book_id=?";
    public static final String DELETEQUERY = "delete from book where book_id=?";
    public static final String FINDALLQUERY = "select * from book";
    public static final String FINDBYAUTHOR = "select * from book where author like ?";
    public static final String FINDBYAUTHORANDCATEGORY = "select * from book where category=? and author like ?";
    public static final String FINDBYPRICE = "select * from book where price<=?";
    public static final String FINDBYID = "select * from book where book_id=?";
    public static final String FINDBYCATEGORY = "select * from book where category=?";
}
