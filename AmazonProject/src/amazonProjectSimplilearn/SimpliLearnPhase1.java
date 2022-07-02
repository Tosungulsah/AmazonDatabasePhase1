package amazonProjectSimplilearn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpliLearnPhase1 {
    
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		String dbUrl= "jdbc:mysql://localhost:3306/robot_vacuum";
		String username = "root";
		String password = "root";
		String query = "select * from robots" ;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(dbUrl,username,password);
		Statement stmt= con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		
		while(rs.next()){
			System.out.print("Brand:"+ rs.getString("brand") + "\t");
			System.out.print("Smart Charging:"+ rs.getString("smart_charging") + "\t");
			System.out.print("Mopping:"+ rs.getString("mopping") + "\t");
			System.out.print("Pascal Pressure:"+ rs.getString("pa") + "\t");
			System.out.println();
		
		
}
}
}
