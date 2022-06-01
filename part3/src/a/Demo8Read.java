package a;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo8Read {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";

		String sql = "select * from person";
//		String sql = "select * from person where name = 'Yael'";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			Statement stmt = con.createStatement();

			// we query data into a ResultSet object
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				Date birthdate = rs.getDate("birthdate");
				System.out.println(id + ", " + name + ", " + birthdate);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(sql);
	}

}
