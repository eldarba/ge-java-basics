package b.dao;

public class Test {

	public static void main(String[] args) {

		try {
			ConnectionPool.getInstance();

			// test
			PersonDao dao = new PersonDaoDb();

//			{// add
//				dao.add(new Person(303, "Lea", LocalDate.of(1970, 1, 15)));
//				System.out.println("person added");
//			}

//			{// read
//				Person p = dao.read(301);
//				System.out.println(p);
//			}

//			{// read all
//				List<Person> list = dao.readAll();
//				System.out.println(list);
//			}

//			{ // update
//				dao.update(new Person(301, "aaa", LocalDate.of(2005, 1, 15)));
//				System.out.println("updated");
//			}

			{// delete
				dao.delete(301);
				System.out.println("deleted");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR: " + e.getMessage());
		} finally {
			ConnectionPool.getInstance().closeAllConnections();
		}

	}

}
