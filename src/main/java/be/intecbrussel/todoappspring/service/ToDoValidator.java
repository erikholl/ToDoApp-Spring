package be.intecbrussel.todoappspring.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class ToDoValidator {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public boolean checkDeadline(Date endDate) {
        LocalDate now = LocalDate.now();
        LocalDate deadline = endDate.toLocalDate();
        if (deadline.compareTo(now) >= 0) return true;
        else return false;
    }
}
