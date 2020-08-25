package com.nur.spring.aerospike.service;

import com.nur.spring.aerospike.domain.GreeterDocument;
import com.nur.spring.aerospike.repository.GreeterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class HelloGreeterDataService implements GreeterDataService{
    private final GreeterRepository repository;
    @Autowired
    public HelloGreeterDataService(GreeterRepository repository){
        this.repository = repository;
    }
    @Override
    public String GetGreeterText() {
        Optional<GreeterDocument> document  = repository.findById("test_greeting_text");
        return document.map(GreeterDocument::getGreetingText).orElse(null);
    }
}
