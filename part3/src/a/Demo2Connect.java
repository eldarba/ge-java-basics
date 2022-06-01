package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2Connect {

	public static void main(String[] args) {

		// loading the driver class manually
		// in most environment you don't need to to the loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// connection details
		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";

		// connect
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			System.out.println("connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// ARM closes the connection at the end of try block
		System.out.println("disconnected");

	}

}
