package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {
    public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend123","root","deekshu457");
			Statement stmt=con.createStatement();
			String sql="insert into employee values(1,'deekshu','2002-01-12',20000)";
			int res=stmt.executeUpdate(sql);
			System.out.println("inserted values");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
