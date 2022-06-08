package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class App2 {

	public static void main(String[] args) throws InterruptedException {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App2.class);) {
			Thread.sleep(5000);
		}
	}

}
