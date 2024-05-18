import java.util.*;
import java.sql.*;
class School
{
void getData()
{
Scanner sc=new Scanner(System.in);
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Allen45singh@12345");
Statement st=c.createStatement();
for(int i=0;i<10;i++)
{
System.out.println("Enter Roll no. of "+(i+1)+"th student=");
int roll=sc.nextInt();
System.out.println("Enter Name=");
String name=sc.next();
System.out.println("Enter the marks");
int marks=sc.nextInt();
st.executeUpdate("insert into Student values('"+roll+"','"+name+"','"+marks+"')");
}
st.close();
c.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
School ob=new School();
ob.getData();
}
}