/**
 * 
 */
//package train;

import java.sql.*;
import com.mvc.util.*;
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
			//Connection conn = DBConnection.createConnection();
			DBConnectionNoneStatic DBConnectionNoneStatic1 = new DBConnectionNoneStatic();
			Connection conn = DBConnectionNoneStatic1.createConnection();
			
			Statement stmt=conn.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from users order by id desc limit 20");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  ");  			
			conn.close();  			
		} catch(Exception e) { 
			System.out.println(e);
		} 
	}	
}
