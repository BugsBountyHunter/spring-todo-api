package com.ahmedsr.todoapi;


import com.ahmedsr.todoapi.modle.Todo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class TodoApiApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(TodoApiApplication.class, args);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
