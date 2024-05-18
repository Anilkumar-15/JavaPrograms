import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int i=0;
int x;
System.out.println("Enter the number= ");
n=sc.nextInt();
while(i<n)
{
x=n%10;
n=n/10;
System.out.print(" " + x);
}
}
}
