package be.intecbrussel.todoappspring.repository;

import be.intecbrussel.todoappspring.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class ToDoDAOMock implements ToDoDAO {
    private String fakeConn;

    @Autowired
    public ToDoDAOMock(String fakeConn) {
        this.fakeConn = fakeConn;
    }

    public void setFakeConn(String fakeConn) {
        this.setFakeConn(fakeConn);
    }

    @Override
    public ToDo saveToDo(ToDo todo) {
        System.out.println("calling saveToDo in ToDoDAOMock");
        return null;
    }

    @Override
    public ToDo deleteToDo(ToDo todo) {
        System.out.println("calling deleteToDo in ToDoDAOMock");
        return null;
    }

    @Override
    public Optional<ToDo> getToDoById(int id) {
        System.out.println("calling getToDo in ToDoDAOMock");
        return Optional.empty();
    }

    @Override
    public List<ToDo> getToDoByUser(String user) {
        System.out.println("calling getToDo in ToDoDAOMock");
        return null;
    }

    @Override
    public List<ToDo> getAllToDos() {
        return null;
    }
}
