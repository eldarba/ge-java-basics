package app.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
