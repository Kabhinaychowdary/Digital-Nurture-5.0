package com.library.repository;

public class BookRepository {

    public BookRepository() {
        System.out.println("BookRepository initialized");
    }

    public void addBook(String title) {
        System.out.println("Book added to repository: " + title);
    }
}