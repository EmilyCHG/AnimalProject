
package com.solvd.concurrent;

import java.sql.Connection;

public interface ConnectPool {

	Connection getConnection();
	boolean releaseConnection(Connection connection);
}
