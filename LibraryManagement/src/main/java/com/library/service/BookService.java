package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    
    // Spring will inject this automatically
    private BookRepository bookRepository;
    
    // Setter for Spring to inject BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookRepository injected into BookService!");
    }
    
    public void addBook(String bookName) {
        System.out.println("BookService: Adding book - " + bookName);
        bookRepository.addBook(bookName);
    }
    
    public String getBook(int id) {
        System.out.println("BookService: Getting book with ID - " + id);
        return bookRepository.getBook(id);
    }
}