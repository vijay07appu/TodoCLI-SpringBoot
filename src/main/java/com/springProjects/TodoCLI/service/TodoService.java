package com.springProjects.TodoCLI.service;

import com.springProjects.TodoCLI.model.Todo;
import com.springProjects.TodoCLI.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService{

    @Autowired
    TodoRepository todoRepository;



    public List<Todo> listAllTodos()
    {
        List<Todo> allTodos=todoRepository.loadTodos();
        return allTodos;

    }

    public  boolean addTodo(String task,String status)
    {
        List<Todo> allTodos=todoRepository.loadTodos();
        int size=allTodos.size();
        int id=++size;
        Todo todo=new Todo(id,task,status);
        allTodos.add(todo);
        boolean adding=todoRepository.saveTodos(allTodos);
        return adding;



    }

    public boolean deleteTodoById(int id){
        List<Todo> allTodos=todoRepository.loadTodos();
        allTodos.remove(id-1);
        int newId=1;
        for(Todo todo:allTodos)
        {
            todo.setId(newId++);

        }
        boolean adding=todoRepository.saveTodos(allTodos);
        return adding;

    }

    public boolean modifyTodo(int id,String status)
    {
        List<Todo> allTodos=todoRepository.loadTodos();
        allTodos.get(id-1).setStatus(status);
        boolean adding=todoRepository.saveTodos(allTodos);
        return adding;
    }


}