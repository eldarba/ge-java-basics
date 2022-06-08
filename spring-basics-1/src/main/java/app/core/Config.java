package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class Config {

	@Bean
	@Scope("prototype")
	public Integer randomInt() {
		return (int) (Math.random() * 101);
	}

}
