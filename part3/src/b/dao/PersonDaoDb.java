package b.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

		} finally { // return the connection to the pool
			if (con != null) {
				ConnectionPool.getInstance().returnConnection(con);
			}
		}

	}

	@Override
	public Person read(int id) {
		Connection con = null;
		try {
			con = ConnectionPool.getInstance().getConnection();
			String sql = "select * from person where id = ?";
			try (PreparedStatement pstmt = con.prepareStatement(sql);) {
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					int personId = rs.getInt("id");
					String name = rs.getNString("name");
					LocalDate birthdate = rs.getDate("birthdate").toLocalDate();
					Person person = new Person(personId, name, birthdate);
					return person;
				} else {
					throw new RuntimeException("read person faild. id " + id + " not found");
				}
			} catch (SQLException e) {
				throw new RuntimeException("read person faild", e);
			}
		} finally {
			if (con != null) {
				ConnectionPool.getInstance().returnConnection(con);
			}
		}
	}

	@Override
	public List<Person> readAll() {
		Connection con = null;
		try {
			con = ConnectionPool.getInstance().getConnection();
			String sql = "select * from person";
			try (PreparedStatement pstmt = con.prepareStatement(sql);) {
				ResultSet rs = pstmt.executeQuery();
				List<Person> list = new ArrayList<>();
				while (rs.next()) {
					int personId = rs.getInt("id");
					String name = rs.getNString("name");
					LocalDate birthdate = rs.getDate("birthdate").toLocalDate();
					Person person = new Person(personId, name, birthdate);
					list.add(person);
				}
				return list;
			} catch (SQLException e) {
				throw new RuntimeException("read all faild", e);
			}
		} finally {
			if (con != null) {
				ConnectionPool.getInstance().returnConnection(con);
			}
		}
	}

	@Override
	public void update(Person person) {
		Connection con = null;
		try {
			con = ConnectionPool.getInstance().getConnection();
			String sql = "update person set name=?, birthdate=? where id = ?";
			try (PreparedStatement pstmt = con.prepareStatement(sql);) {
				pstmt.setString(1, person.getName());
				pstmt.setDate(2, Date.valueOf(person.getBirthdate()));
				pstmt.setInt(3, person.getId());
				int rowCount = pstmt.executeUpdate();
				if (rowCount == 0) {
					throw new RuntimeException("update person faild. id " + person.getId() + " not found");
				}
			} catch (SQLException e) {
				throw new RuntimeException("update person faild", e);
			}
		} finally {
			if (con != null) {
				ConnectionPool.getInstance().returnConnection(con);
			}
		}

	}

	@Override
	public void delete(int id) {
		Connection con = null;
		try {
			con = ConnectionPool.getInstance().getConnection();
			String sql = "delete from person where id = ?";
			try (PreparedStatement pstmt = con.prepareStatement(sql);) {
				pstmt.setInt(1, id);
				int rowCount = pstmt.executeUpdate();
				if (rowCount == 0) {
					throw new RuntimeException("delete person faild. id " + id + " not found");
				}
			} catch (SQLException e) {
				throw new RuntimeException("delete person faild", e);
			}
		} finally {
			if (con != null) {
				ConnectionPool.getInstance().returnConnection(con);
			}
		}

	}

}
