import java.util.*;
class TwelthElement
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
System.out.println("" + a[12]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("such index does not exist" );
}
}
}

