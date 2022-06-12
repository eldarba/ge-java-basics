package app.core.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.core.entities.Person;

@Repository
@Transactional
public class PersonDao {

	@Autowired
	private EntityManager em;

	public int create(Person person) {
		try {
			em.persist(person);
			return person.getId();
		} catch (Exception e) {
			throw new RuntimeException("create person failed", e);
		}
	}

	public Person getPerson(int personId) {
		Person person = em.find(Person.class, personId);
		if (person != null) {
			return person;
		}
		throw new RuntimeException("person with id " + personId + " not found");
	}

	public void update(Person person) {
		Person PersonPersistent = getPerson(person.getId());
		PersonPersistent.setName(person.getName());
		PersonPersistent.setAge(person.getAge());
	}

}
