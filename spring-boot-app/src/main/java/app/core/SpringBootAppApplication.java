package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import app.core.beans.Person;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) throws InterruptedException {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootAppApplication.class, args);

		Person p = ctx.getBean(Person.class);
		System.out.println(p);

	}

}
