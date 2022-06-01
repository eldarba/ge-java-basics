package b.dao;

public interface PersonDao {

	void add(Person person);

	Person read(int id);

	void update(Person person);

	void delete(int id);

}
