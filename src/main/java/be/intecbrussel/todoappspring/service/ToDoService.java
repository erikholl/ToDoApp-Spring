package be.intecbrussel.todoappspring.service;

import be.intecbrussel.todoappspring.model.ToDo;

import java.util.List;
import java.util.Optional;

public interface ToDoService {
    public ToDo createToDo(ToDo todo);
    public ToDo updateToDo(ToDo todo);
    public ToDo deleteToDo(ToDo todo);
    public List<ToDo> getAllToDos();
    public ToDo getToDoByUser(String user);
    public Optional<ToDo> getToDoById(int id);

}
