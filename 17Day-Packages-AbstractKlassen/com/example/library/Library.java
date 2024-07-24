package com.example.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
         this.books=new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBooks(Book book) {
        books.add(book);
    }

    public void printBookDetails(Book book){
        System.out.println("Title: "+ book.getTitle());
        System.out.println("Author: "+ book.getAuthor());
        System.out.println("Isbn: "+ book.getIsbn());
        System.out.println("Year: "+ book.getYear());
    }
}
