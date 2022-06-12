package app.core.apps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.dao.PersonService;
import app.core.entities.Person;

@Component
public class App2 implements CommandLineRunner {

	@Autowired
	private PersonService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("STARTING APP 2 ==========================");
		try {
			service.create(new Person(3, "Lior", 26));

		} catch (Exception e) {
			System.out.println("===== ERROR =====");
			System.out.println(e.getMessage());
			System.out.println("===== ===== =====");
//			e.printStackTrace();
		}
	}

}
