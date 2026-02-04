package com.springProjects.TodoCLI.runner;

import com.springProjects.TodoCLI.model.Todo;
import com.springProjects.TodoCLI.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class TodoRunner implements CommandLineRunner {

    @Autowired
    TodoService todoService;



    @Override
    public void run(String... args) throws Exception {



        while (true) {

            System.out.println("Welcome to Todo Application ");
            List<Todo> allTodos = todoService.listAllTodos();

            if (allTodos.isEmpty()) {
                System.out.println("Your Todo List is Empty Please use Below Menu !!!");
            } else {

                for (Todo todo : allTodos) {
                    System.out.println("ID= " + todo.getId() + "   Task=" + todo.getTask() + "   Status=" + todo.getStatus());
                }


            }
            System.out.println();

            boolean OptionLoop=true;

            while (OptionLoop) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Menu : ");
                System.out.println();
                System.out.println("1.ADD    2.Delete     3.Modify Status       4.Print By Status     5.Exit");
                int option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1: {
                        System.out.println("Enter Task :");
                        String task = sc.nextLine();
                        System.out.println("Enter Status");
                        String status = sc.nextLine();
                        boolean added=todoService.addTodo(task, status);
                        if(added)
                        {
                            System.out.println("Todo added successfully");
                        }
                        else{
                            System.out.println("Failed to add todo");
                        }
                        OptionLoop = true;
                        break;
                    }
                    case 2:{
                        System.out.println("Enter the id to delete todo");
                        int id=sc.nextInt();
                        sc.nextLine();
                        boolean deleted=todoService.deleteTodoById(id);
                        if(deleted)
                        {
                            System.out.println("Todo deleted successfully");
                        }
                        else{
                            System.out.println("Failed to delete todo");
                        }
                        OptionLoop = true;
                        break;

                    }

                    case 3:{
                        System.out.println("Enter the id to modify status");
                        int id=sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the status to modify");
                        String status=sc.nextLine();
                        boolean modified=todoService.modifyTodo(id,status);
                        if(modified)
                        {
                            System.out.println("Todo  modified successfully");
                        }
                        else{
                            System.out.println("Failed to modify todo");
                        }
                        OptionLoop = true;
                        break;
                    }
                    case 5: {
                        OptionLoop=false;
                        break;



                    }
                }
            }

        }
    }
}