package com.raven.springbootfetchtype.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOOK_DETAILS")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "author_name")
    private String authorName;

    @Column(name = "year_of_published")
    private String yearOfPublished;

    @Column(name = "category")
    private String category;

    public Book() {
    }

    public Book(String bookName, String authorName, String yearOfPublished, String category) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfPublished = yearOfPublished;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(String yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", yearOfPublished='" + yearOfPublished + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
