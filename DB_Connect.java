package cs157a;

import java.sql.*;
import java.sql.DriverManager;

public class DB_Connect {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs157a","root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select *  from fruit");
		while(rs.next())
			System.out.println(rs.getString(1) + " " + rs.getInt(2));
		con.close();
		
	}
	
}
