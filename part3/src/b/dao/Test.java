package b.dao;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {

		try {
			ConnectionPool.getInstance();

			// test
			PersonDao dao = new PersonDaoDb();
			dao.add(new Person(301, "Gearge", LocalDate.of(2000, 1, 15)));
			System.out.println("person added");

		} catch (Exception e) {

		} finally {
			ConnectionPool.getInstance().closeAllConnections();
		}

	}

}
