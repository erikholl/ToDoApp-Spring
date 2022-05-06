package be.intecbrussel.todoappspring.repository;

import be.intecbrussel.todoappspring.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ToDoDAOHibernate implements ToDoDAO {

    @Override
    public ToDo saveToDo(ToDo todo) {
        return null;
    }

    @Override
    public ToDo deleteToDo(ToDo todo) {
        return null;
    }

    @Override
    public Optional<ToDo> getToDoById(int id) {
        return Optional.empty();
    }

    @Override
    public List<ToDo> getToDoByUser(String user) {
        return null;
    }

    @Override
    public List<ToDo> getAllToDos() {
        return null;
    }
}
