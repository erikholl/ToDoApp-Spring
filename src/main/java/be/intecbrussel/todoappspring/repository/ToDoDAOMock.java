package be.intecbrussel.todoappspring.repository;

import be.intecbrussel.todoappspring.model.ToDo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class ToDoDAOMock implements ToDoDAO {
    @Override
    public ToDo saveToDo(ToDo todo) {
        return null;
    }

    @Override
    public ToDo deleteToDo(ToDo todo) {
        return null;
    }

    @Override
    public Optional<ToDo> getToDo(ToDo todo) {
        return Optional.empty();
    }

    @Override
    public List<ToDo> getToDo(String user) {
        return null;
    }
}
