package com.example.main;

import com.example.library.Book;
import com.example.library.Library;

public class Main {
    public static void main(String[] args) {

        Library library1 = new Library();
        Book book1 = new Book("Nuul", "Picasssso?!", "1223", 1934);
        Book book2 = new Book("Coconuts", "Picashuuu", "1273", 1997);
        library1.addBooks(book1);
        library1.addBooks(book2);
        library1.getBooks();
        library1.printBookDetails(book1);
        System.out.println("--------");
        for (Book book : library1.getBooks()) {
            library1.printBookDetails(book);
        }

    }
}
