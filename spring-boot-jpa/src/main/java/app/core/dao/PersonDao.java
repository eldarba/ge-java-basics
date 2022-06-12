package app.core.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.core.entities.Person;

@Repository
public class PersonDao {

	@Autowired
	private EntityManager em;

	public int create(Person person) {
		try {
			em.getTransaction().begin();
			em.persist(person);
			em.getTransaction().commit();
			return person.getId();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new RuntimeException("create person failed", e);
		}
	}

}
