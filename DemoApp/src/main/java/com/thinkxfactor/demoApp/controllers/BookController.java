package com.thinkxfactor.demoApp.controllers;

import com.thinkxfactor.demoApp.entity.Admin;
import com.thinkxfactor.demoApp.entity.Book;
import com.thinkxfactor.demoApp.entity.Student;
import com.thinkxfactor.demoApp.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BooksRepository booksRepository;

    @GetMapping("/getAll")
    public List<Book> getBooks() {
        return booksRepository.findAll();
    }

    @PostMapping("/add")
    public Book addbOOKS(@RequestBody Book book) {
        return booksRepository.save(book);
    }
}