/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
/**
 *
 * @author divya
 */
public class Book extends Material{
    int pages;
    String language;
    String bindingType;
    Author author;
    Genre genre;

    public Book() {
    }

    public Book(int pages, String language, String bindingType, Author author, Genre genre, String name, String regDate, boolean isAvailable) {
        super(name, regDate, isAvailable);
        this.pages = pages;
        this.language = language;
        this.bindingType = bindingType;
        this.author = author;
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }    
}
