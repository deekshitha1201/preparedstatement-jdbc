package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ModifyTable {
   public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend123","root","deekshu457");
		Statement stmt=con.createStatement();
		String sql="alter table employee modify name varchar(20)";
		boolean b=stmt.execute(sql);
		System.out.println("successfully modified");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
