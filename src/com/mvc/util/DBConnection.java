/**
 * 
 */
package com.mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author kevingates
 *
 */
public class DBConnection {
	public static Connection createConnection()
	{	
		Connection con = null;
		String url = "jdbc:mysql://172.100.0.20:3306/robo2_1228?useSSL=false"; //MySQL URL and followed by the database name
		String username = "root"; 
		String password = "1"; 
			try 
			{
				try 
				{
					Class.forName("com.mysql.jdbc.Driver"); //loading mysql driver 
				} 
				catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				} 
				con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
				System.out.println("Printing connection object "+con);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		return con; 
	}
}