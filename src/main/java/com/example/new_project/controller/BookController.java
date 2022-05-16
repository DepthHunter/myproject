package com.example.new_project.controller;

import com.example.new_project.model.Book;
import com.example.new_project.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/abonement")
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}