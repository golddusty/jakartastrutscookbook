package com.oreilly.strutsckbk.ch05;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

import org.apache.commons.beanutils.RowSetDynaClass;

public class UserDao {

	public RowSetDynaClass getUsersRowSet() throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		RowSetDynaClass rowSet = null;
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from users");
			rowSet = new RowSetDynaClass(rs);			
		}
		finally {
			if (conn != null) conn.close();
		}
		return rowSet;
	}

	private Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/test");
	}

}
