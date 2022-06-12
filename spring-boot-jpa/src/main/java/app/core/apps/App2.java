package app.core.apps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.services.PersonService;

@Component
public class App2 implements CommandLineRunner {

	@Autowired
	private PersonService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("STARTING APP 2 ==========================");
		try {
			// CREATE
			// service.create(new Person(3, "Lior", 26));

			// READ
//			{
//				System.out.println(service.find(2));
//			}

			// READ ALL
//			{
//				System.out.println("===============");
//
//				List<Person> persons = service.findAll();
//				for (Person person : persons) {
//					System.out.println(person);
//				}
//				// shorter version functional programming
//				// service.findAll().forEach(System.out::println);
//				System.out.println("===============");
//			}

//			{ // update
//				Person person = new Person(2, "Meir", 25);
//				service.updtae(person);
//			}

			{ // delete
				service.delete(2);
			}

		} catch (Exception e) {
			System.out.println("===== ERROR =====");
			System.out.println(e.getMessage());
			System.out.println("===== ===== =====");
//			e.printStackTrace();
		}
	}

}
