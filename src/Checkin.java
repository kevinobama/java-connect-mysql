/**
 * 
 */
//package train;

import java.sql.*;
/**
 * @author kevingates
 *
 */
public class Checkin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://172.100.0.20:3306/robo2_1228?useSSL=false","root","1");  
		
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from users order by id desc limit 20");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  ");  			
			con.close();  
			
		} catch(Exception e) { 
			System.out.println(e);
		} 
	}
}
