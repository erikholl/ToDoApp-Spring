package be.intecbrussel.todoappspring.repository;

import be.intecbrussel.todoappspring.model.ToDo;

import java.util.List;
import java.util.Optional;

public interface ToDoDAO {
    ToDo saveToDo(ToDo toDo);
    ToDo deleteToDo(ToDo toDo);
    Optional<ToDo> getToDo(int toDo);
    List<ToDo> getToDo(String user);
}
