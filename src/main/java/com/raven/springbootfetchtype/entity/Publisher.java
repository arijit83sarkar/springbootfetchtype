package com.raven.springbootfetchtype.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PUBLISHER_DETAILS")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "publisher_name")
    private String publisherName;

    @Column(name = "year_of_established")
    private String yearOfEstablished;

    @Column(name = "address")
    private String address;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH}
    )
    @JoinColumn(name = "publisher_id")
    private List<Book> bookList;

    public Publisher() {
    }

    public Publisher(String publisherName, String yearOfEstablished, String address) {
        this.publisherName = publisherName;
        this.yearOfEstablished = yearOfEstablished;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getYearOfEstablished() {
        return yearOfEstablished;
    }

    public void setYearOfEstablished(String yearOfEstablished) {
        this.yearOfEstablished = yearOfEstablished;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", yearOfEstablished='" + yearOfEstablished + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
