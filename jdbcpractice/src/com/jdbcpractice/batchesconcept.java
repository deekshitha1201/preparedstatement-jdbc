package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class batchesconcept {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend123","root","deekshu457");
			Statement stmt=con.createStatement();
			con.setAutoCommit(false);
			String sql="insert into employee values(5,'hyderabad')";
			stmt.addBatch(sql);
			String sql1="insert into employee values(6,'andhra')";
			stmt.addBatch(sql1);
			int[] c=stmt.executeBatch();
			con.commit();
			System.out.println("successfully inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
