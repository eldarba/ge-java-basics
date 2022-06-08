package app.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Person {

	{
		System.out.println("person created");
	}

	private int id;
	private String name;
	private int age;

	@PostConstruct
	public void a() {
		System.out.println("person init");
	}

	@PreDestroy
	public void b() {
		System.out.println("person destroy");
	}

}
