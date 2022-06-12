package app.core.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.core.entities.Person;

@Repository
public class PersonDaoManual {

	@Autowired
	private EntityManagerFactory factory;

	public int create(Person person) {
		EntityManager em = factory.createEntityManager();
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
