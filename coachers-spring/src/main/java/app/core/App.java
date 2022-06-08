package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import app.core.beans.Coach;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class App {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);) {

			Coach runCoach = ctx.getBean(Coach.class);
			System.out.println(runCoach.getLicense());
			System.out.println(runCoach.getTrainingPlan());

		}
	}

}
