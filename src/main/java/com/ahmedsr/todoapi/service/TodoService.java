package com.ahmedsr.todoapi.service;

import com.ahmedsr.todoapi.controller.TodoController;
import com.ahmedsr.todoapi.db.ITodoRepository;
import com.ahmedsr.todoapi.modle.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {


    private ITodoRepository iTodoRepository;
    @Autowired
    public TodoService (ITodoRepository iTodoRepository){
        this.iTodoRepository = iTodoRepository;
    }
    public TodoService(){

    }
    /**
     * Get All todos
     * @return List of todos
     */
    public List<Todo> findAll(){
        return  iTodoRepository.findAll();
    }

    public Todo save(Todo todo){
      return iTodoRepository.insert(todo);
    }

    public void delete(String id){
        iTodoRepository.deleteById(id);
    }

}
