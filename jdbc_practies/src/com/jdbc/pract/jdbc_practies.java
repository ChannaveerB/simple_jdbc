package com.jdbc.pract;
import java.sql.*;

public class jdbc_practies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//1. get a connection to DB.
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airport","root","j2ee");
	
	//2.create a ststement.
	Statement stmt = con.createStatement();
	
	//3.Exicute the sql query.
	ResultSet rSet = stmt.executeQuery("select * from airport_table");
	
	//4.Process the result set.
	
	while(rSet.next()) {
		System.out.println(rSet.getString("airport_name")+","+rSet.getInt("no_of_planes"));
	}
	

	}

catch(Exception exc) {
	exc.printStackTrace();
}

}
}