package be.intecbrussel.todoappspring.repository;

import be.intecbrussel.todoappspring.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Scope("prototype")
public class ToDoDAOJDBC implements ToDoDAO {
    private Connection conn;

    @Autowired
    public ToDoDAOJDBC(Connection conn) {
        this.setConn(conn);
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    @Override
    public ToDo saveToDo(ToDo todo) throws SQLException {
        Long toDoId = todo.getId();

        if (todo.getId() != null) {
            // update
            Date toDoStartDate = todo.getStartDate();
            Date toDoEndDate = todo.getEndDate();
            String toDoDescription = todo.getDescription();
            String toDoStatus = todo.getStatus();
            String toDoUser = todo.getUser();

            String update = "UPDATE todo_table SET " +
                    "start_date = '" + toDoStartDate + "', " +
                    "end_date = '" + toDoEndDate + "', " +
                    "description = '" + toDoDescription + "', " +
                    "status = '" + toDoStatus + "', " +
                    "user = '" + toDoUser + "' WHERE id = " + toDoId + ";";

            PreparedStatement ps = this.conn.prepareStatement(update);
            ps.executeUpdate();

        } else {
            // insert
            String save = "INSERT INTO todo_table(start_date, end_date, " +
                    "description, status, user) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(save);
            ps.setDate(1, todo.getStartDate());
            ps.setDate(2, todo.getEndDate());
            ps.setString(3, todo.getDescription());
            ps.setString(4, todo.getStatus());
            ps.setString(5, todo.getUser());
            ps.executeUpdate();
        }
//        System.out.println("To-do added to the DB. To-do ID: " + ...;
        return todo; // placeholder
    }

    @Override
    public ToDo deleteToDo(ToDo todo) throws SQLException {
        long id = todo.getId();
        String delete = "DELETE FROM todo_table WHERE id = " + id;
        Statement s = this.conn.createStatement();
        s.executeUpdate(delete);
        return todo; // placeholder
    }

    @Override
    public Optional<ToDo> getToDoById(int id) throws SQLException {
        String getById = "SELECT * FROM todo_table WHERE id = " + id;

        // not need for prepared statement as input is limited to int
        Statement s = this.conn.createStatement();
        ResultSet rs = s.executeQuery(getById);
        List<ToDo> listToDoById = parseToDoResultSet(rs);

        if(listToDoById.size() == 1) {
            return Optional.of(listToDoById.get(0));
        } else if (listToDoById.size() > 1) {
            System.out.println("id " + id + " returns multiple entries! the " +
                                       "first entry will be returned");
            return Optional.of(listToDoById.get(0));
        } else {
            System.out.println("no to-do entries found for id " + id);
            return Optional.empty();
        }
    }

    @Override
    public List<ToDo> getToDoByUser(String user) throws SQLException {
        String getByUser = "SELECT * FROM todo_table WHERE user LIKE ?";

        PreparedStatement ps = this.conn.prepareStatement(getByUser);
        ps.setString(1, user);
        ResultSet rs = ps.executeQuery();
        List<ToDo> listToDosUser = parseToDoResultSet(rs);
        return listToDosUser;
    }

    @Override
    public List<ToDo> getAllToDos() throws SQLException {
        String getAll = "SELECT * FROM todo_table";
        Statement s = this.conn.createStatement();
        ResultSet rs = s.executeQuery(getAll);
        List<ToDo> listAllToDos = parseToDoResultSet(rs);
        return listAllToDos;

    }

    // helper method to parse new to-do objects from DB to-do's
    private List<ToDo> parseToDoResultSet(ResultSet rs) throws SQLException {
        List<ToDo> listToDos = new ArrayList<>();
        while (rs.next()) {
            ToDo toDo = new ToDo();
            toDo.setId(rs.getLong("id"));
            toDo.setStartDate(rs.getDate("start_date"));
            toDo.setEndDate(rs.getDate("end_date"));
            toDo.setDescription(rs.getString("description"));
            toDo.setStatus(rs.getString("status"));
            toDo.setUser(rs.getString("user"));
        }
        return listToDos;
    }
}
