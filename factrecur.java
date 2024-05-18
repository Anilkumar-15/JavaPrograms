import java.util.Scanner;
class Fact
{
static int recurr(double n)
{
if(n==1)
return 1;
else
{
return(n*recurr(n-1));
}
}
public static void main(String args[])
{
double n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number for factorial=");
n=sc.nextInt();
System.out.println("the factorial of " + n + " is " + recurr(n));
}
}
