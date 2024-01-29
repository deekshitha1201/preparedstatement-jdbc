package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddValues {
   public static void main(String[] args) throws SQLException {
	try {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/backend123","root","deekshu457");
		PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?)");
		System.out.println("enter the id");
		int id=sc.nextInt();
		stmt.setInt(1, id);
		System.out.println("enter the name");
		String name=sc.next();
		stmt.setString(2,name);
		int res=stmt.executeUpdate();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
