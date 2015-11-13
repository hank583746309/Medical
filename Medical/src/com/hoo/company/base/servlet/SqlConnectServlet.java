package com.hoo.company.base.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SqlConnectServlet extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		
		/*String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ddn";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "root","mijiaqi");
			PreparedStatement pstmt = conn.prepareStatement("select * from base_user");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				out.println(rs.getString("user_name"));
				out.println("<br>");
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://zzscrj888.gnway.cc:1433;databaseName=ksoa";

		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "sa","123");
			PreparedStatement pstmt = conn.prepareStatement("select * from userinfoo where username=\"admin\"");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				out.print(rs.getString("username"));
				out.print(",");
				out.print(rs.getString("userpwd"));
				out.print(",");
				out.print(rs.getString("usercode"));
				out.println("<br>");
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		/*try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "sa","123");
			PreparedStatement pstmt = conn.prepareStatement("select * from contacts");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				out.print(rs.getString("name"));
				out.print(",");
				out.print(rs.getString("tel"));
				out.print(",");
				out.print(rs.getString("home_tel"));
				out.println("<br>");
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
		
		out.flush();
		out.close();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
}
