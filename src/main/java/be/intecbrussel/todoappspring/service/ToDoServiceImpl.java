package be.intecbrussel.todoappspring.service;

import be.intecbrussel.todoappspring.model.ToDo;
import be.intecbrussel.todoappspring.repository.ToDoDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl implements ToDoService {
    private ToDoDAO toDoDAO;

    public ToDoServiceImpl(ToDoDAO toDoDAO) {
        this.toDoDAO = toDoDAO;
    }

    @Override
    public ToDo createToDo(ToDo todo) {
        toDoDAO.saveToDo(todo);
        return todo;
    }

    @Override
    public ToDo updateToDo(ToDo todo) {
        toDoDAO.saveToDo(todo);
        return todo;
    }

    @Override
    public ToDo saveToDo(ToDo todo) {
        return null;
    }

    @Override
    public ToDo deleteToDo(ToDo todo) {
        toDoDAO.deleteToDo(todo);
        return todo;
    }

    @Override
    public Optional<ToDo> getToDo(int id) {
        return Optional.empty();
    }

    @Override
    public List<ToDo> getToDo(String user) {
        return null;
    }

    @Override
    public List<ToDo> getAllToDos() {
        return null;
    }

    @Override
    public ToDo getToDoByUser(String user) {
        return null;
    }

    @Override
    public Optional<ToDo> getToDoById(int id) {
        return Optional.empty();
    }
}
