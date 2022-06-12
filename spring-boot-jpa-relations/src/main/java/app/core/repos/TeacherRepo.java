package app.core.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
