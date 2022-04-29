package be.intecbrussel.todoappspring.repository;

import be.intecbrussel.todoappspring.model.ToDo;

import java.util.List;
import java.util.Optional;

public interface ToDoDAO {
    ToDo saveToDo(ToDo todo);
    ToDo deleteToDo(ToDo todo);
    Optional<ToDo> getToDo(ToDo todo);
    List<ToDo> getToDo(String user);
}
