package be.intecbrussel.todoappspring.service;

import be.intecbrussel.todoappspring.model.ToDo;
import be.intecbrussel.todoappspring.repository.ToDoDAO;

import java.util.List;
import java.util.Optional;

public class ToDoServiceImpl implements ToDoService {
    private ToDoDAO toDoDAO;

    public ToDoServiceImpl(ToDoDAO toDoDAO) {
        this.toDoDAO = toDoDAO;
    }

    @Override
    public ToDo createToDo(ToDo todo) {
        return null;
    }

    @Override
    public ToDo updateToDo(ToDo todo) {
        return null;
    }

    @Override
    public ToDo deleteToDo(ToDo todo) {
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
