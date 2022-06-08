package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class Config {

	@Bean
	@Scope("prototype")
	public Integer random1() {
		return (int) (Math.random() * 101);
	}

	@Bean
	@Scope("prototype")
	public Integer random2() {
		return (int) (Math.random() * 101) + 100;
	}

}
