package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.dao.PersonDaoManual;
import app.core.entities.Person;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(App.class, args);

		PersonDaoManual dao = ctx.getBean(PersonDaoManual.class);
		Person person = new Person(0, "Dan", 30);
		dao.create(person);

	}

}
