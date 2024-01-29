package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preparedstatement {
    public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend123","root","deekshu457");
			String sql="insert into employee values(?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1, 2);
			stmt.setString(2, "deekshu");;
			int res=stmt.executeUpdate();
			System.out.println("rows get affected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
