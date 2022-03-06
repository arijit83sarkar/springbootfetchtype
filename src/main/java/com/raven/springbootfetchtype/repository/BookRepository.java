package com.raven.springbootfetchtype.repository;

import com.raven.springbootfetchtype.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
