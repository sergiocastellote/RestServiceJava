package com.apprest.dao;

import java.util.LinkedList;
import java.util.List;
import java.sql.*;

import com.apprest.entities.User;


public class UserDAO implements UserDAOImpl{
	public List<User> listUsers() {
		List<User> result = new LinkedList<>();
		
		try
		{
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3306/sys","root", "root");
		   Statement s = conexion.createStatement();
		   ResultSet rs = s.executeQuery ("select * from users");
		   while (rs.next()) 
		   { 
			   int cols = rs.getMetaData().getColumnCount();
			   User[] arr = new User[cols];
			   for(int i=0; i<cols; i++){
				      arr[i] = (User) rs.getObject(i+1);
				    }
				    records.add(arr);
			  rs.	
		       
		   }

		} catch (Exception e)
		{
		   e.printStackTrace();
		}
		
		return result;
		
		
	}
}
