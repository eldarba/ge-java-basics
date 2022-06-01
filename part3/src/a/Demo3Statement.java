package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Statement {

	public static void main(String[] args) {

		// connection details
		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";

		String sql = "create table person(id int, name varchar(25), birthdate date)";
		// connect
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			System.out.println("connected");
			// to send sql commands we need a statement object
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(sql);
		System.out.println("disconnected");
	}

}
