package app.core.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.School;
import app.core.entities.Student;
import app.core.entities.Teacher;
import app.core.repos.AddressRepo;
import app.core.repos.SchoolRepo;
import app.core.repos.StudentRepo;
import app.core.repos.TeacherRepo;

@Service
@Transactional
public class SchoolService {

	@Autowired
	private SchoolRepo schoolRepo;
	@Autowired
	private AddressRepo addressRepo;
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private TeacherRepo teacherRepo;

	public int addSchool(School school) {
		if (!schoolRepo.existsById(school.getId())) {
			schoolRepo.save(school);
			return school.getId();
		} else {
			throw new RuntimeException("addSchool failed. already exists!");
		}
	}

	public int addTeacher(Teacher teacher) {
		if (!teacherRepo.existsById(teacher.getId())) {
			teacherRepo.save(teacher);
			return teacher.getId();
		} else {
			throw new RuntimeException("addTeacher failed. already exists!");
		}
	}

	public Teacher getTeacher(int teacherId) {
		Optional<Teacher> opt = this.teacherRepo.findById(teacherId);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new RuntimeException("getTeacher failed. not found!");
		}
	}

	public Student getStudent(int studentId) {
		Optional<Student> opt = this.studentRepo.findById(studentId);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new RuntimeException("getStudent failed. not found!");
		}
	}

	public List<Student> findByTeacherId(int teacherId) {
		return this.studentRepo.findByTeachersId(teacherId);
	}

}
