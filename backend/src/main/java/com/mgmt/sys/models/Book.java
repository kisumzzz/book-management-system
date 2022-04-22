package com.mgmt.sys.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String author;
    private String rating;
    private String comment;
    private String finishedDate;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String bookCode;

    public Book () {}

    public Book(String title, String author, String rating, String comment, String finishedDate, String imageUrl, String bookCode) {
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.comment = comment;
        this.finishedDate = finishedDate;
        this.imageUrl = imageUrl;
        this.bookCode = bookCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(String finishedDate) {
        this.finishedDate = finishedDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", rating='" + rating + '\'' +
                ", comment='" + comment + '\'' +
                ", finishedDate='" + finishedDate + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
