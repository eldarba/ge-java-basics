package a;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Demo5Create {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";

		String[] names = { "Dan", "Ran", "Dalia", "Moshe", "Ziv", "Orna", "Yael", };

		try (Connection con = DriverManager.getConnection(url, user, password);) {
			Statement stmt = con.createStatement();
			for (int id = 105; id <= 205; id++) {
				String name = names[(int) (Math.random() * names.length)];
				int year = (int) (Math.random() * 11) + 2000;
				int month = (int) (Math.random() * 12) + 1;
				int day = (int) (Math.random() * 28) + 1;
				Date birthdate = Date.valueOf(LocalDate.of(year, month, day));
				String sql = "insert into person values(" + id + ", '" + name + "', '" + birthdate + "')";
				stmt.executeUpdate(sql);
				System.out.println(sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
