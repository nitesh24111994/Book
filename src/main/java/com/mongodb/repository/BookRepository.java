package com.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.model.Book;

public interface BookRepository extends MongoRepository<Book,Integer>{

}
