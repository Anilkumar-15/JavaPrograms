import java.util.*;
class Galti
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
try
{
int a,b,c;
System.out.println("Enter the value of a and b ");
a=sc.nextInt();
b=sc.nextInt();
c=a/b;
System.out.println(" " + c);
}
catch(ArithmeticException e)
{
System.out.println("can't divided by zero");
}
}
}