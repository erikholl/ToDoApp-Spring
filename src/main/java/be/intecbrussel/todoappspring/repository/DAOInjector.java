package be.intecbrussel.todoappspring.repository;

import be.intecbrussel.todoappspring.model.ToDo;
import org.springframework.stereotype.Repository;

@Repository
public class DAOInjector {
    private ToDoDAO toDoDAO;
//    private ToDo toDo;

    public DAOInjector(ToDoDAO toDoDAO) {
        System.out.println("creating a connection injector...");
        this.toDoDAO = toDoDAO;
    }

    public void save(ToDo toDo) {
        System.out.println("calling save in DAOInjector...");
        toDoDAO.saveToDo(toDo);
    }

    public void delete(ToDo toDo) {
        System.out.println("calling delete in DAOInjector...");
        toDoDAO.deleteToDo(toDo);
    }

    public void getById(int id) {
        System.out.println("calling getById in DAOInjector...");
        toDoDAO.getToDo(id);
    }

    public void getByUser(String user) {
        System.out.println("calling getByUser in DAOInjector...");
        toDoDAO.getToDo(user);
    }
}
