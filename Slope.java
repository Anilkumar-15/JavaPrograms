import java.util.Scanner;
class Slope
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int m,b;
int x,y;
System.out.println("Please enter the cordinate of line -");
x=sc.nextInt();
y=sc.nextInt();
m=y/x;
System.out.println("Slope of the line is " + m);
b=(m*x)-y;
System.out.println("The intercept point on Y-axis = " + b);
}
}
