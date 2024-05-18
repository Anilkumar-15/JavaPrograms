import java.io.*;
import java.sql.*;
class javadb2 {
	public static void main(String[] args) throws Exception
	{
		try
		{
		String url = "jdbc:mysql://localhost:3306/college";         // database details
		String username = "root";                                                    // MySQL credentials
		String password = "root";
		String query = "select *from student";                               // query to be run
		Class.forName("com.mysql.cj.jdbc.Driver");                     // Driver name
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established successfully");
		Statement st = con.createStatement();
ResultSet rs = st.executeQuery(query);                                  // Execute query
		rs.next();
		String name= rs.getString("name");     // Retrieve name from db
		System.out.println(name);                     // Print result on console
		String roll	= rs.getInt("roll");                // Retrieve roll from db
		System.out.println(roll);                        // Print result on console
		st.close();                                                   // close statement
		con.close();                                                // close connection
		System.out.println("Connection Closed....");
	}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
}