package com.example.restapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books") // Optional: Specify table name explicitly
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String isbn;

    // No-argument constructor
    public Book(){

    }

    // All-argument constructor (optional, for convenience)
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters and setters
    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return isbn;
    }
}
