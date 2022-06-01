package b.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDaoDb implements PersonDao {

	@Override
	public void add(Person person) {
		Connection con = null;
		try {
			// get a connection from the connection pool
			con = ConnectionPool.getInstance().getConnection();
			String sql = "insert into person values(?, ?, ?)";
			// a PreparedStatement can get parameters as ?
			try (PreparedStatement pstmt = con.prepareStatement(sql);) {
				// initialize the PreparedStatement parameters
				pstmt.setInt(1, person.getId());
				pstmt.setString(2, person.getName());
				pstmt.setDate(3, Date.valueOf(person.getBirthdate()));
				// execute the SQL
				pstmt.executeUpdate();
			} catch (SQLException e) {
				throw new RuntimeException("add person faild", e);
			}

		} finally {
			if (con != null) {
				ConnectionPool.getInstance().returnConnection(con);
			}
		}

	}

	@Override
	public Person read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
