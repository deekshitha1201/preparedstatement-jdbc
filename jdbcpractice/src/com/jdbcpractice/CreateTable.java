package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend123","root","deekshu457");
		System.out.println("connected");
		Statement stmt=con.createStatement();
		String sql="create table employee(id int,name varchar(10),dob date)";
		boolean b=stmt.execute(sql);
		System.out.println("successfully created table");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
