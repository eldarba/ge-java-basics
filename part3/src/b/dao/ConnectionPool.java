package b.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ConnectionPool {

	private static ConnectionPool instance;
	private Set<Connection> connections = new HashSet<>();
	public static final int MAX = 10;
	private String url = "jdbc:mysql://localhost:3306/db1";
	private String user = "root";
	private String password = "12345";

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

	public synchronized Connection getConnection() {
		while (this.connections.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
