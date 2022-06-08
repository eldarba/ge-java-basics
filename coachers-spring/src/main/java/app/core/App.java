package app.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import app.core.beans.Coach;
import app.core.beans.SportCoach;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class App {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);) {

			Coach runCoach = ctx.getBean("runningCoach", Coach.class);
			Coach tennisCoach = ctx.getBean("tennisCoach", Coach.class);
			System.out.println("============");
			System.out.println(runCoach.getLicense());
			System.out.println(runCoach.getTrainingPlan());
			System.out.println("============");
			System.out.println(tennisCoach.getLicense());
			System.out.println(tennisCoach.getTrainingPlan());
			System.out.println("============");

		}
	}

	@Bean
	@Scope("prototype")
	public Coach tennisCoach(@Value("${coach.plan.tenis}") String plan) {
		SportCoach coach = new SportCoach(plan);
		return coach;
	}

}
