package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
//@Scope("singleton") // default
@Scope("prototype")
public class Person {

	private int id;
	private String name;
	private int age;

	public Person() {
		System.out.println("person created");
	}

}
