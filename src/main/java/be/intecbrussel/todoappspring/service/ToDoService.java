package be.intecbrussel.todoappspring.service;

import be.intecbrussel.todoappspring.model.ToDo;
import be.intecbrussel.todoappspring.repository.ToDoDAO;

import java.util.List;
import java.util.Optional;

public interface ToDoService extends ToDoDAO {
    ToDo createToDo(ToDo todo);
    ToDo updateToDo(ToDo todo);
    ToDo deleteToDo(ToDo todo);
    List<ToDo> getAllToDos();
    ToDo getToDoByUser(String user);
    Optional<ToDo> getToDoById(int id);

}
