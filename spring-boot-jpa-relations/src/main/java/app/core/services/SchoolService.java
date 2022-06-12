package app.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.School;
import app.core.repos.AddressRepo;
import app.core.repos.SchoolRepo;

@Service
@Transactional
public class SchoolService {

	@Autowired
	private SchoolRepo schoolRepo;
	@Autowired
	private AddressRepo addressRepo;

	public int addSchool(School school) {
		if (!schoolRepo.existsById(school.getId())) {
			schoolRepo.save(school);
			return school.getId();
		} else {
			throw new RuntimeException("addSchool failed. already exists!");
		}
	}

}
