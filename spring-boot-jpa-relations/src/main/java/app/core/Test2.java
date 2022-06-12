package app.core;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.entities.Address;
import app.core.entities.School;
import app.core.entities.Student;
import app.core.services.SchoolService;

//@Component
public class Test2 implements CommandLineRunner {

	@Autowired
	private SchoolService service;

	@Override
	public void run(String... args) throws Exception {

		Student st1 = new Student(0, "aaa", LocalDate.of(1985, 01, 01), null);
		Student st2 = new Student(0, "bbb", LocalDate.of(2000, 01, 01), null);
		Student st3 = new Student(0, "ccc", LocalDate.of(2010, 01, 01), null);
		Student st4 = new Student(0, "ddd", LocalDate.of(1992, 01, 01), null);
		Student st5 = new Student(0, "eee", LocalDate.of(2005, 01, 01), null);

		School school1 = new School(0, "Bar Ilan", new Address(0, "Israel", "Tel Aviv", "Gordon", 100, null), null);
		School school2 = new School(0, "Ben Gurion", new Address(0, "Israel", "Beer Sheva", "Hahistadroot", 32, null),
				null);

		school1.addStudent(st1);
		school1.addStudent(st2);
		school1.addStudent(st3);

		school2.addStudent(st4);
		school2.addStudent(st5);

		service.addSchool(school1);
		service.addSchool(school2);
	}

}
