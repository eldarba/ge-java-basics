package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
@Scope("prototype")
public class Car {

	// use @Value to inject values from property file
	@Value("${car.brand:generic}")
	private String brand;

	// DI - inject helper beans
	@Autowired
	// @Qualifier("turboEngine")
	private Engine standardEngine;

	public void drive() {
		this.standardEngine.start();
		System.out.println("car is driving");
	}

	public void stop() {
		this.standardEngine.stop();
		System.out.println("car stopped");
	}

}
