package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.entities.Student;
import app.core.entities.Teacher;
import app.core.services.SchoolService;

//@Component
public class Test3 implements CommandLineRunner {

	@Autowired
	private SchoolService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			Teacher t1 = new Teacher(0, "aaa", null);
			Teacher t2 = new Teacher(0, "bbb", null);
			Teacher t3 = new Teacher(0, "ccc", null);

			Student s1 = new Student(0, "aa", null, null, null);
			Student s2 = new Student(0, "bb", null, null, null);
			Student s3 = new Student(0, "cc", null, null, null);
			Student s4 = new Student(0, "dd", null, null, null);
			Student s5 = new Student(0, "ee", null, null, null);

			t1.addStudent(s1);
			t1.addStudent(s2);
			t1.addStudent(s3);
			t3.addStudent(s4);
			t3.addStudent(s5);

			service.addTeacher(t1);
			service.addTeacher(t2);
			service.addTeacher(t3);

		} catch (Exception e) {
			System.out.println("======== ERROR ===============");
			System.out.println("Error: " + e.getMessage());
			System.out.println("==============================");
			e.printStackTrace();
		}
	}

}
