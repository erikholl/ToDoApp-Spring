package be.intecbrussel.todoappspring.service;

import be.intecbrussel.todoappspring.model.ToDo;
import org.springframework.stereotype.Service;

@Service
public class ServiceInjector {
    private ToDoService toDoService;

    public ServiceInjector(ToDoService toDoService) {
        System.out.println("creating service injector ...");
        this.toDoService = toDoService;
    }

    public void create(ToDo toDo) {
        System.out.println("calling create in service injector...");
        toDoService.createToDo(toDo);
    }

    public void update(ToDo toDo) {
        System.out.println("calling update in service injector...");
        toDoService.updateToDo(toDo);
    }

    public void delete(ToDo toDo) {
        System.out.println("calling delete in service injector...");
        toDoService.deleteToDo(toDo);
    }

    public void getAll() {
        System.out.println("calling getAll in service injector...");
        toDoService.getAllToDos();
    }

    public void getByUser(String user) {
        System.out.println("calling getByUser in service injector...");
        toDoService.getToDoByUser(user);
    }

    public void getById(int id) {
        System.out.println("calling getById in service injector...");
        toDoService.getToDoById(id);
    }
}
