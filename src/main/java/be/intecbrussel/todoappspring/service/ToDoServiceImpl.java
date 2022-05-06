package be.intecbrussel.todoappspring.service;

import be.intecbrussel.todoappspring.model.ToDo;
import be.intecbrussel.todoappspring.repository.ToDoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl implements ToDoService {
    private ToDoDAO toDoDAO;

    @Autowired
    public ToDoServiceImpl(ToDoDAO toDoDAO) {
        this.setToDoDAO(toDoDAO);
    }

    public void setToDoDAO(ToDoDAO toDoDAO) {
        this.toDoDAO = toDoDAO;
    }

    @Override
    public ToDo createToDo(ToDo todo) throws SQLException {
        toDoDAO.saveToDo(todo);
        return todo; // placeholder
    }

    @Override
    public ToDo updateToDo(ToDo todo) throws SQLException {
        toDoDAO.saveToDo(todo);
        return todo; // placeholder
    }

    @Override
    public ToDo saveToDo(ToDo todo) throws SQLException {
        toDoDAO.saveToDo(todo);
        return todo; // placeholder
    }

    @Override
    public ToDo deleteToDo(ToDo todo) throws SQLException {
        toDoDAO.deleteToDo(todo);
        return todo; // placeholder
    }

    @Override
    public Optional<ToDo> getToDoById(int id) throws SQLException {
        Optional<ToDo> optionalToDo = toDoDAO.getToDoById(id);
        return optionalToDo; // placeholder
    }

    public List<ToDo> getToDoByUser(String user) throws SQLException {
        return toDoDAO.getToDoByUser(user);
    }

    @Override
    public List<ToDo> getAllToDos() throws SQLException {
        return toDoDAO.getAllToDos();
    }

}
