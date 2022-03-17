package com.raven.springbootfetchtype.repository;

import com.raven.springbootfetchtype.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Integer> {
}
