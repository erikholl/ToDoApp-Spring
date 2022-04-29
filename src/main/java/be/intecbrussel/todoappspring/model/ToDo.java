package be.intecbrussel.todoappspring.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "todo_table")
public class ToDo {
    // what properties does a to-do have?
    // start date (Date)
    // end date (deadline) (Date)
    // description (String)
    // status (open, closed)
    // belonging to user (String)
    // ... (start simple)

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "start_date")
    Date startDate;

    @Column(name = "end_date")
    Date endDate;

    String description;
    String status;
    String user;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDo)) return false;
        ToDo toDo = (ToDo) o;
        return getStartDate().equals(
                toDo.getStartDate()) && getEndDate().equals(
                toDo.getEndDate()) && getDescription().equals(
                toDo.getDescription()) && getUser().equals(toDo.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStartDate(), getEndDate(), getDescription(),
                            getUser());
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
