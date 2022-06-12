package app.core.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.dao.PersonRepository;
import app.core.entities.Person;

@Service
@Transactional
public class PersonService {

	@Autowired
	private PersonRepository repo;

	// CREATE
	public int create(Person person) {
		if (!repo.existsById(person.getId())) {
			Person p = repo.save(person);
			return p.getId();
		} else {
			throw new RuntimeException("create person failed. id " + person.getId() + " already exists");
		}
	}

	// READ
	public Person find(int personId) {
		Optional<Person> opt = repo.findById(personId);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new RuntimeException("person with id " + personId + " not found");
		}

		// in functional programming syntax:

//		return repo.findById(personId)
//				.orElseThrow(() -> new RuntimeException("person with id" + personId + " not found"));
	}

	// READ ALL
	public List<Person> findAll() {
		return repo.findAll();
	}

	// UPDATE
	public void updtae(Person person) {
		if (repo.existsById(person.getId())) {
			repo.save(person);
		} else {
			throw new RuntimeException("updtae person failed. id " + person.getId() + " not found");
		}
	}

	// DELETE
	public void delete(int personId) {
		if (repo.existsById(personId)) {
			repo.deleteById(personId);
		} else {
			throw new RuntimeException("delete person failed. id " + personId + " not found");
		}
	}

}
