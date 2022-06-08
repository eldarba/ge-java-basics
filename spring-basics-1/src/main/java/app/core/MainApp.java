package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Person;

public class MainApp {

	public static void main(String[] args) {
		/*
		 * ApplicationContext is the main object in spring applications
		 * 
		 * it creates, contains and manages the application beans.
		 * 
		 * beans are objects with different roles in the application
		 */
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {
			Person p1 = ctx.getBean(Person.class);
			Person p2 = ctx.getBean(Person.class);
			p1.setName("aaa");
			p2.setName("bbb");

			System.out.println(p1);
			System.out.println(p2);

			System.out.println("==== random:");
			for (int i = 0; i < 5; i++) {
				int r = ctx.getBean("random2", Integer.class);
				System.out.println(r);
			}
		}

		System.out.println("END");

	}

}
