package com.hoo.company.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlConnect {
	public static void main(String[] args) {
		String driver = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
		String url = "jdbc:sqlserver://zzscrj888.gnway.cc:1433;databaseName=ksoa";

		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "sa","123");
			PreparedStatement pstmt = conn.prepareStatement("select * from userinfoo");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("username"));
				System.out.println("<br>");
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
