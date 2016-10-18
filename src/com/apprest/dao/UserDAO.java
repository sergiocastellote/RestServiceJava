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
		   Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost:32768/sys","root", "root");
		   Statement s = conexion.createStatement();
		   ResultSet rs = s.executeQuery ("select * from users");
		   while (rs.next()) 
		   { 
			   String name = rs.getString(1);
			   String surname = rs.getString(2);			   	
			   User arr = new User(name, surname);			   
			   result.add(arr);			   		       
		   }
		   conexion.close();
		   s.close();
		   rs.close();

		} catch (Exception e)
		{
		   e.printStackTrace();
		}
		
		return result;			
	}

	public void saveUser(User user) {
		System.out.println(user);
		try
		{
			   Class.forName("com.mysql.jdbc.Driver");
			   Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost:32768/sys","root", "root");			   
			   PreparedStatement p = conexion.prepareStatement("insert into users values (?,?)");
			   p.setString(1, user.getName());
			   p.setString(2, user.getSurname());		
			   p.execute();
			   p.close();
			   conexion.close();		   
			  
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
