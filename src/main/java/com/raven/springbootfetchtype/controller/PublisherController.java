package com.raven.springbootfetchtype.controller;

import com.raven.springbootfetchtype.entity.Publisher;
import com.raven.springbootfetchtype.repository.BookRepository;
import com.raven.springbootfetchtype.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    private PublisherRepository publisherRepository;

    @PostMapping("/savePublisher")
    public String savePublisher(@RequestBody Publisher publisher) {
        System.out.println("Publisher save start...");

        Publisher publisherOut = publisherRepository.save(publisher);
        System.out.println("Publisher :: " + publisherOut.toString());

        System.out.println("Publisher save ends...");
        return "Publisher saved!!!";
    }

    @GetMapping("/getPublisher/{id}")
    public String getPublisher(@PathVariable(name = "id") String id) {
        System.out.println("Publisher fetch start...");

        Publisher publisherOut = publisherRepository.getById(Integer.valueOf(id));
        System.out.println("Publisher details :: " + publisherOut.toString());
//        System.out.println("Books :: " + publisherOut.getBookList());

        System.out.println("Publisher fetch ends...");
        return "Publisher fetched!!!";
    }


}
