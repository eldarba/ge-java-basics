package app.core.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Person;

@Service
@Transactional
public class PersonService {

	@Autowired
	private PersonDaoUltimate dao;

	// CREATE
	public int create(Person person) {
		if (!dao.existsById(person.getId())) {
			Person p = dao.save(person);
			return p.getId();
		} else {
			throw new RuntimeException("create person failed. id " + person.getId() + " already exists");
		}
	}

	// READ
	public Person find(int personId) {
		Optional<Person> opt = dao.findById(personId);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new RuntimeException("person with id " + personId + " not found");
		}

		// in functional programming syntax:

//		return dao.findById(personId)
//				.orElseThrow(() -> new RuntimeException("person with id" + personId + " not found"));
	}
	// READ ALL
	// UPDAT
	// DELETE

}
