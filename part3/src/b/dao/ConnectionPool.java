package b.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	private static ConnectionPool instance;
	private List<Connection> connections = new ArrayList<>();
	public static final int MAX = 10;
	private String url = "jdbc:mysql://localhost:3306/db1";
	private String user = "root";
	private String password = "1234";

	private ConnectionPool() throws SQLException {
		for (int i = 0; i < MAX; i++) {
			connections.add(DriverManager.getConnection(url, user, password));
		}
	}

	public static ConnectionPool getInstance() {
		if (instance == null) {
			try {
				instance = new ConnectionPool();
			} catch (SQLException e) {
				throw new RuntimeException("ConnectionPool init failed", e);
			}
		}
		return instance;
	}

}
