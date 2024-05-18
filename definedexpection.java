import java.util.*;
class ABC extends Exception
{
void validate(int x) throws ABC
{
if(x<0)
{
throw new ABC();
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int a=sc.nextInt();
ABC ob=new ABC();
try
{
ob.validate(a);
}
catch(ABC e)
{
System.out.println("no is not valid");
}
System.out.println("The number is valid");
}
}
