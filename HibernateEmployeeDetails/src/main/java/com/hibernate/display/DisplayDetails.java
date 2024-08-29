package com.hibernate.display;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayDetails {

	   public void display() throws Exception {
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
	    	Statement stmt = con.createStatement();
	    	String query = "Select * from Employee";
	    	ResultSet rs = stmt.executeQuery(query);
	    	while (rs.next()) {
			       System.out.println("EmpID: " + rs.getInt("EmpId") + " " + "EmpName: " + rs.getString("EmpName") + " " + "Designation: " + rs.getString("Designation"));
			    }
	    	con.close();
       

	}

}
