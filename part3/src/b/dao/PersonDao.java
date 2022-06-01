package b.dao;

import java.util.List;

public interface PersonDao {

	void add(Person person);

	Person read(int id);

	List<Person> readAll();

	void update(Person person);

	void delete(int id);

}
