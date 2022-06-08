package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan
@PropertySource("application.properties")
@EnableScheduling
public class App {

	public static void main(String[] args) throws InterruptedException {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);) {
			Thread.sleep(17_000);
		}
	}

}
