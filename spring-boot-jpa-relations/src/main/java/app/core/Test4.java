package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.entities.Teacher;
import app.core.services.SchoolService;

@Component
public class Test4 implements CommandLineRunner {

	@Autowired
	private SchoolService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			int teacherId = 4;
			Teacher teacher = service.getTeacher(teacherId);
			System.out.println(teacher);
			// System.out.println(teacher.getStudents());
			System.out.println(service.findByTeacherId(teacherId));

		} catch (Exception e) {
			System.out.println("======== ERROR ===============");
			System.out.println("Error: " + e.getMessage());
			System.out.println("==============================");
			e.printStackTrace();
		}
	}

}
