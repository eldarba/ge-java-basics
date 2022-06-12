package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.dao.PersonDao;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(App.class, args);

		PersonDao dao = ctx.getBean(PersonDao.class);
		try {

//			{ // create person
//				Person person = new Person(0, "Serrah", 22);
//				int id = dao.create(person);
//				System.out.println("created person with id " + id);
//			}

//			{ // get a person by id
//				Person person = dao.getPerson(100);
//				System.out.println(person);
//			}

//			{ // update
//				Person person = new Person(2, "Moshe", 50);
//				dao.update(person);
//				System.out.println("updated");
//			}

			{// delete
				dao.delete(1);
			}

		} catch (Exception e) {
			System.out.println("===== ERROR =====");
			System.out.println(e.getMessage());
			System.out.println("===== ===== =====");
//			e.printStackTrace();
		}
	}

}
