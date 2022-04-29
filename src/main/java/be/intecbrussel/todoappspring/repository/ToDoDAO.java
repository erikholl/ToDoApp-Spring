package be.intecbrussel.todoappspring.repository;

import be.intecbrussel.todoappspring.model.ToDo;

import java.util.List;
import java.util.Optional;

public interface ToDoDAO {
    public ToDo saveToDo(ToDo todo);
    public ToDo deleteToDo(ToDo todo);
    public Optional<ToDo> getToDo(ToDo todo);
    public List<ToDo> getToDo(String user);
}
