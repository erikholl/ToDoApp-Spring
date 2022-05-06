package be.intecbrussel.todoappspring.service;

import be.intecbrussel.todoappspring.model.ToDo;
import be.intecbrussel.todoappspring.repository.ToDoDAO;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface ToDoService extends ToDoDAO {
    ToDo createToDo(ToDo todo) throws SQLException;
    ToDo updateToDo(ToDo todo) throws SQLException;
    ToDo deleteToDo(ToDo todo) throws SQLException;
    List<ToDo> getAllToDos() throws SQLException;
    List<ToDo> getToDoByUser(String user) throws SQLException;
    Optional<ToDo> getToDoById(int id) throws SQLException;

}
