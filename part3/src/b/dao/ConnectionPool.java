package b.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConnectionPool {

	private static ConnectionPool instance;
	private Set<Connection> connections = new HashSet<>();
	public static final int MAX = 10;
	private String url = "jdbc:mysql://localhost:3306/db1";
	private String user = "root";
	private String password = "1234";
	private boolean open;

	private ConnectionPool() throws SQLException {
		for (int i = 0; i < MAX; i++) {
			connections.add(DriverManager.getConnection(url, user, password));
		}
		this.open = true;
		System.out.println("pool open");
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
		if (!this.open) {
			throw new RuntimeException("getConnection failed - pool is closed");
		}
		while (this.connections.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Iterator<Connection> it = this.connections.iterator();
		Connection con = it.next();
		it.remove();
		return con;
	}

	public synchronized void returnConnection(Connection con) {
		this.connections.add(con);
		notifyAll();
	}

	public synchronized void closeAllConnections() {
		open = false;
		while (this.connections.size() < MAX) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (Connection connection : connections) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("pool closed");
	}

}
