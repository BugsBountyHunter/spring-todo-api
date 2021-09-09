package com.ahmedsr.todoapi.controller;

import com.ahmedsr.todoapi.modle.Todo;
import com.ahmedsr.todoapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = {"/api/v1/todos"})
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController (TodoService todoService){
        this.todoService = todoService;
    }

    /**
     * Get all todos.
     * @return List of todos and status code.
     */
    @GetMapping(value = {"", "/"})
    public ResponseEntity<List<Todo>> getAllTodos(){
        List<Todo> todos = todoService.findAll();
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }

    @PostMapping(value = {"","/"})
    public ResponseEntity<Todo> createNewTodo(@Validated @RequestBody Todo todo){
        Todo newTodo = todoService.save(todo);
        return new ResponseEntity<>(newTodo, HttpStatus.CREATED);
    }
    @DeleteMapping(value = {"/{id}"})
    public ResponseEntity<Void> deleteTodo(@Validated @PathVariable  String id){
        todoService.delete(id);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
