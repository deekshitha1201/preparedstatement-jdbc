package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrivedata {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend123","root","deekshu457");
			Statement stmt=con.createStatement();
			String sql="select * from employee";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+ rs.getString(2));
			}
			System.out.println("excuted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
