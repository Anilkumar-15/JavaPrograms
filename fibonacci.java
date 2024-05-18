import java.util.Scanner;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of term which you want to see in series");
int n=sc.nextInt();
int x,y;
int z;
System.out.println("Enter the first term");
x=sc.nextInt();
System.out.println("Enter the second term");
y=sc.nextInt();
System.out.print(" " + x);
System.out.print(" " + y);
for(int i=0;i<n-2;i++)
{
z=x+y;
System.out.print(" " + z);
x=y;
y=z;
}
}
}


