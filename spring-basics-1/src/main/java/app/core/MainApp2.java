package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Car;

public class MainApp2 {

	public static void main(String[] args) throws InterruptedException {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {

			Car car = ctx.getBean(Car.class);
			System.out.println(car.getBrand());
			car.drive();

			Thread.sleep(3000);
			car.stop();

		}

	}

}
