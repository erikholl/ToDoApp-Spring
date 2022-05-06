package be.intecbrussel.todoappspring.repository;

import be.intecbrussel.todoappspring.model.ToDo;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface ToDoDAO {
    ToDo saveToDo(ToDo toDo) throws SQLException;
    ToDo deleteToDo(ToDo toDo) throws SQLException;
    Optional<ToDo> getToDoById(int id) throws SQLException;
    List<ToDo> getToDoByUser(String user) throws SQLException;
    List<ToDo> getAllToDos() throws SQLException;
}
