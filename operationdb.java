import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
class OperationDB
{
void createTable()
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/allen","root","Allen45singh@12345");
Statement st=c.createStatement();
st.executeUpdate("create table Customers (CustomerId int,FirstName varchar(30),LastName varchar(30),DateCreataed DATE)");
c.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
void insertData()
{
Scanner sc=new Scanner(System.in);
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/allen","root","Allen45singh@12345");
Statement st=c.createStatement();
System.out.println("Enter CustomerId=");
int CustomerId=sc.nextInt();
System.out.println("Enter the First Name=");
String FirstName=sc.next();
System.out.println("Enter the Last Name=");
String LastName=sc.next();
System.out.println("Enter the Date=");
try{
String tarik = sc.next();
SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
Date date=d.parse(tarik);
}
catch(Exception e)
{
System.out.println(e);
}
st.executeUpdate(" insert into Customers values('"+CustomerId+"','"+FirstName+"','"+LastName+"','"+date+"')");
c.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
OperationDB ob=new OperationDB();
System.out.println("Do you create table with Name Customer press Y otherwise press N");
char input=sc.next().charAt(0);
if(input=='Y')
{
ob.createTable();
}
if(input=='N')
{
System.out.println("Do you want insert data in the talbe press Y otherwise press N");
char inp=sc.next().charAt(0);
if(inp=='Y')
{
ob.insertData();
}
else
{
System.out.println("THANK YOU");
}
}
System.out.println("THANK YOU");
}
}
