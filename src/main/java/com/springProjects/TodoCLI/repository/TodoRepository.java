package com.springProjects.TodoCLI.repository;

import com.springProjects.TodoCLI.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository{


    private static final String FILE_Path=System.getProperty("user.dir")+"/ToDoCLI/TodoCLI/src/main/java/com/springProjects/TodoCLI/data/data.json";
    ObjectMapper mapper=new ObjectMapper();


    // List all Todos
    public List<Todo> loadTodos(){
        try{
            File file=new File(FILE_Path);
            if(!file.exists()){
                return new ArrayList<>();
            }
            return mapper.readValue(file,new TypeReference<List<Todo>>(){});

        }
        catch(Exception e){


            throw new RuntimeException("Failed to load the Data");

        }

        
    }

    // save all Todos
    public boolean saveTodos(List<Todo> todos){
        try{
            File file=new File(FILE_Path);
            file.getParentFile().mkdirs();
            mapper.writerWithDefaultPrettyPrinter().writeValue(file,todos);
            return true;
        }
        catch(Exception e){
            throw new RuntimeException("Failed to save the Todos");

        }
    }




}