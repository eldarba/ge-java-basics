package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.entities.Address;
import app.core.entities.School;
import app.core.services.SchoolService;

@Component
public class Test1 implements CommandLineRunner {

	@Autowired
	private SchoolService service;

	@Override
	public void run(String... args) throws Exception {
		service.addSchool(new School(0, "JBT", new Address(0, "Israel", "Haifa", "markoni", 3, null)));
	}

}
