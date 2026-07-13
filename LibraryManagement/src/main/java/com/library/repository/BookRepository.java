package com.library.repository;

public class BookRepository {
    
    public void addBook(String bookName) {
        System.out.println("Book added to repository: " + bookName);
    }
    
    public String getBook(int id) {
        System.out.println("Fetching book with ID: " + id);
        return "Book_" + id;
    }
}