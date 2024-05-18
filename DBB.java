import java.sql.*;
import java.util.*;
class DBconnect
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/allen","root","Allen45singh@12345");
Statement st=c.createStatement();
st.executeUpdate("insert into student values ('1','Anil kumar')");
st.close();
c.close();
}
catch(Exception e)
{
System.out.print(" " + e);
}


}
}
