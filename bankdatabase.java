import java.sql.*;
import java.util.*;
class Customer
{
Customer()
{
Scanner sc=new Scanner(System.in);
int cid,initialBalance,AccountNumber;
String customerName;
System.out.println("Entert the id");
cid=sc.nextInt();
System.out.println("Enter the name");
customerName=sc.next();
System.out.println("Enter the initial balance");
initialBalance=sc.nextInt();
System.out.println("Enter the Account Number");
AccountNumber=sc.nextInt();
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/allen","root","Allen45singh@12345");
Statement st=c.createStatement();
st.executeUpdate("insert into customer values('"+cid+"','"+customerName+"','"+initialBalance+"','"+AccountNumber+"')");
st.close();
c.close();
}
catch(Exception e)
{
System.out.println(" " + e);
}
}
void deposite()
{
Scanner sc=new Scanner(System.in);
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/allen","root","Allen45singh@12345");
Statement st=con.createStatement();
System.out.println("Enter your account Number");
int acc=sc.nextInt();
System.out.println("Enter the amount for deposite");
int amount=sc.nextInt();
ResultSet r=st.executeQuery("select initialBalance from customer" + " where accountNumber ="+acc);
if(r.next())
{
int balance=r.getInt(1);
int dep=balance + amount;
System.out.println(amount +"rs you have deposite");
System.out.println("Your currently balance is " + dep);
st.executeUpdate("update customer set initialBalance="+dep+" where accountNumber =" +acc);
}
}
catch(Exception e)
{
System.out.println(" " + e);
}
}
void withdraw()
{
Scanner sc=new Scanner(System.in);
try{
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/allen","root","Allen45singh@12345");
Statement st=c.createStatement();
System.out.println(" ");
System.out.println("********** The process for withdrwal follow following steps **********");
System.out.println("Enter your accountNumber");
int acc=sc.nextInt();
System.out.println("Enter the amount for withdrawal");
int amount=sc.nextInt();
ResultSet r=st.executeQuery("select initialBalance from customer " + "where accountNumber= "+acc);
int bal;
if(r.next())
{
int balance=r.getInt(1);
bal=balance-amount;
System.out.println(amount+ "rs amount have been withdrwal");
System.out.println("Remaining Balance is " + bal);
st.executeUpdate("Update customer set initialBalance="+bal+" where accountNumber= "+acc);
}
c.close();
}
catch(Exception e)
{
System.out.println("" + e);
}
}
void display()
{
Scanner sc=new Scanner(System.in);
try{
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/allen","root","Allen45singh@12345"); 
Statement st=c.createStatement();
System.out.println("Enter your Account Number");
int acc=sc.nextInt();
ResultSet r=st.executeQuery("select * from Customer"+" where accountNumber= "+acc);
System.out.println("-------------------------------------------------------------------");
while(r.next())
{
System.out.println(r.getInt(1) + "         "+r.getString(2) + "         " +r.getInt(3)+"         " +r.getInt(4));
}
st.close();
c.close();
}
catch(Exception e)
{
System.out.println(" " + e);
}
}
public static void main(String args[])
{
Customer ob =new Customer();
System.out.println("Do you want show your details then press Y otherwise press N");
Scanner sc=new Scanner(System.in);
char input=sc.next().charAt(0);
if(input=='Y')
{
ob.display();
}
else
{
if(input=='N')
{
System.out.println("Do you want withdrawal then press Y otherwise press N");
char inpu=sc.next().charAt(0);
if(inpu=='Y')
{
ob.withdraw();
}
else
{
System.out.println("Do you want to Deposite money then press Y otherwise press N");
char inp=sc.next().charAt(0);
if(inp=='Y')
{
ob.deposite();
}
else
{
System.out.println("THANK YOU SIR FOR VISIT");
}
}
}
}
}
}

