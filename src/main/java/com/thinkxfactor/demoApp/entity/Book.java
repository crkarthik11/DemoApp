package com.thinkxfactor.demoApp.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="tbl_book")
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "book_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "isbn_number")
    private String isbnNumber;

    @Column(name = "category")
    private String category;

    public Book() {
        System.out.println("Book created");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
