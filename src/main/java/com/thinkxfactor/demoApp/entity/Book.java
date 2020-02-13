package com.thinkxfactor.demoApp.entity;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String name;
    private String author;
    private String isbnNumber;
    private String category;

    public Book() {
        System.out.println("Book created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
