package b.dao;

public class Test {

	public static void main(String[] args) {

		try {
			ConnectionPool.getInstance();

			// test
			PersonDao dao = new PersonDaoDb();

//			{// add
//				dao.add(new Person(301, "Gearge", LocalDate.of(2000, 1, 15)));
//				System.out.println("person added");
//			}

			{// read
				Person p = dao.read(301);
				System.out.println(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR: " + e.getMessage());
		} finally {
			ConnectionPool.getInstance().closeAllConnections();
		}

	}

}
