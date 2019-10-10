package com.averkin.resolver;

import com.averkin.resolver.mongo.CustomerRepository;
import com.averkin.resolver.mongo.Xpath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ControllerAdvice
public class Service {


    @Autowired
    private CustomerRepository repository;

    @PostMapping("/add")
    public void home(@RequestBody  Xpath xpath) {
        repository.save(xpath);
        System.out.println();
    }
}
