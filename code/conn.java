package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;


public class conn {
	
	Connection connection;
	Statement statement;
	
	public conn() {
		try {
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelMS","root","a9p4p4a8@#");
			statement = connection.createStatement();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
