package com.ahmedsr.todoapi.db;

import com.ahmedsr.todoapi.modle.Todo;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITodoRepository extends MongoRepository<Todo, String> {

    Todo findByTitle(String title);
    Todo findByUserId(String userId);
}
