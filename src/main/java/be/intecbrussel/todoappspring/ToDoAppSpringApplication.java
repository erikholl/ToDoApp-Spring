package be.intecbrussel.todoappspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// TODO (no pun) - get JDBC connection working
// TODO - hibernate implementation
// TODO - test setup / mock implementation


@SpringBootApplication
public class ToDoAppSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(ToDoAppSpringApplication.class, args);
	}

}
