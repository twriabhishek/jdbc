package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class crudQuery {
	
//  1)Driver Load
//	System load driver automatically.
	
	
//	2)connection established

	public void createdata() {
		// TODO Auto-generated method stub
	    try {
	        // Establish the connection
	    	String url = "jdbc:mysql://localhost:3306/test";
	        String username = "root";
	        String password = "123456789";
	        Connection connection = DriverManager.getConnection(url, username, password);
	        
//		3)statement create
	        Statement stm = connection.createStatement();
	        System.out.println("Connected to MySQL database!");
	        
//		4)Perform database operations here
	        String query="INSERT INTO customer (id, name, address, gender, city, Pincode) VALUES (191, 'Arnav Singh', 'lkj', 'M', 'Varanasi', '345667')";
	        boolean b=stm.execute(query);
	         if(b=true) {
	        	 System.out.println("Executed Successfully");
	         }
	         else {
	        	 System.out.println("Sorry!");
	         }
	//  5)Close the connection
	        connection.close();
	        System.out.println("Connection closed successfully!");
	    } catch (Exception e) {
	        System.err.println("Error connecting to the database: " + e.getMessage());
	    }
		
	}

	public void readdata() {
		// TODO Auto-generated method stub
	    try {
	        // Establish the connection
	    	String url = "jdbc:mysql://localhost:3306/test";
	        String username = "root";
	        String password = "123456789";
	        Connection connection = DriverManager.getConnection(url, username, password);
	        
//		3)statement create
	        Statement stm = connection.createStatement();
	        System.out.println("Connected to MySQL database!");
	        
//		4)Perform database operations here
	        String query="select * from customer";
	        boolean b=stm.execute(query);
	         if(b=true) {
	        	 System.out.println("Executed Successfully");
	         }
	         else {
	        	 System.out.println("Sorry!");
	         }
	//  5)Close the connection
	        connection.close();
	        System.out.println("Connection closed successfully!");
	    } catch (Exception e) {
	        System.err.println("Error connecting to the database: " + e.getMessage());
	    }
		
	}

	public void updatedata() {
		// TODO Auto-generated method stub
	    try {
	        // Establish the connection
	    	String url = "jdbc:mysql://localhost:3306/test";
	        String username = "root";
	        String password = "123456789";
	        Connection connection = DriverManager.getConnection(url, username, password);
	        
//		3)statement create
	        Statement stm = connection.createStatement();
	        System.out.println("Connected to MySQL database!");
	        
//		4)Perform database operations here
	        String query="UPDATE customer SET name = Gautam, address = Noida, WHERE id=122";
	        boolean b=stm.execute(query);
	         if(b=true) {
	        	 System.out.println("Executed Successfully");
	         }
	         else {
	        	 System.out.println("Sorry!");
	         }
	//  5)Close the connection
	        connection.close();
	        System.out.println("Connection closed successfully!");
	    } catch (Exception e) {
	        System.err.println("Error connecting to the database: " + e.getMessage());
	    }
		
	}

	public void deletedata() {
		// TODO Auto-generated method stub
	    try {
	        // Establish the connection
	    	String url = "jdbc:mysql://localhost:3306/test";
	        String username = "root";
	        String password = "123456789";
	        Connection connection = DriverManager.getConnection(url, username, password);
	        
//		3)statement create
	        Statement stm = connection.createStatement();
	        System.out.println("Connected to MySQL database!");
	        
//		4)Perform database operations here
	        String query="select * from customer";
	        boolean b=stm.execute(query);
	         if(b=true) {
	        	 System.out.println("Executed Successfully");
	         }
	         else {
	        	 System.out.println("Sorry!");
	         }
	//  5)Close the connection
	        connection.close();
	        System.out.println("Connection closed successfully!");
	    } catch (Exception e) {
	        System.err.println("Error connecting to the database: " + e.getMessage());
	    }
		
	}
}