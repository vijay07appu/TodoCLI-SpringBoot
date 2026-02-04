package com.springProjects.TodoCLI.model;

public class Todo{

    private int id;
    private String task;
    private String status;

    public Todo(int id, String task, String status){
        this.id=id;
        this.task=task;
        this.status=status;
    }


    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setTask(String task){
        this.task=task;
    }
    public String getTask(){
        return task;
    }

    public void setStatus(String status){

        this.status=status;
    }
    public String getStatus(){
        return status;
    }

}