package a;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class Demo1Driver {

	public static void main(String[] args) {

		// find the available db drivers
		Enumeration<Driver> drivers = DriverManager.getDrivers();

		System.out.println("list of drivers:");
		while (drivers.hasMoreElements()) {
			Driver currentDriver = drivers.nextElement();
			System.out.println(currentDriver);
		}
		System.out.println("================");

	}

}
