package com.library.main;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryMain {
    
    public static void main(String[] args) {
        
        // Step 1: Load Spring context from XML file
        System.out.println("Loading Spring Application Context...");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        System.out.println("Spring Context loaded successfully!");
        
        // Step 2: Get BookService bean from Spring (NOT using new!)
        BookService bookService = context.getBean("bookService", BookService.class);
        
        // Step 3: Use the service
        bookService.addBook("The Alchemist");
        bookService.addBook("Wings of Fire");
        
        String book = bookService.getBook(1);
        System.out.println("Retrieved: " + book);
        
        // Step 4: Close the context
        ((ClassPathXmlApplicationContext) context).close();
        System.out.println("Spring Context closed.");
    }
}