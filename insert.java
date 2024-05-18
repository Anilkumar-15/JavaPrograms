import java.sql.*;
import java.util.*;
class javadb3 {
	public static void main(String a[])
	{
		try {
		String url1 = "jdbc:mysql://localhost:3306/college";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url1, user, pass);
		System.out.println("Connection Established successfully");
		Statement st = con.createStatement();
		
		Scanner k = new Scanner(System.in);
		System.out.println("enter name");
		String name = k.next();
		System.out.println("enter roll no");
		int roll = k.nextInt();
// Inserting data using SQL query
	        String sql = "insert into student values("  +roll+   ",'" +name+ "')";
			int m = st.executeUpdate(sql);
			if (m == 1)
				System.out.println("inserted successfully : " + sql);
			else
				System.out.println("insertion failed");
			con.close();
		}

		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
		}
	}
}
