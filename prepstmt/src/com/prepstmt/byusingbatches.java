package com.prepstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class byusingbatches {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/day4","root","deekshu457");
			String sql="insert into student values(?,?,?)";
			PreparedStatement s=con.prepareStatement(sql);
			s.setInt(1,101);
			s.setInt(2, 20);
			s.setString(3, "deekshu");
			s.addBatch();
			String sql2="insert into student values(?,?,?)";
			s=con.prepareStatement(sql2);
			s.setInt(1, 102);
			s.setInt(2, 23);
			s.setString(3, "purnima");
			s.addBatch();
			String sql3="delete from student where id=?";
			s=con.prepareStatement(sql3);
			s.setInt(1, 102);
			s.addBatch();
			int[] a=s.executeBatch();
			System.out.println("updated");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
