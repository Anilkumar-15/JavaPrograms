import java.util.*;
class Table
{
public static void main(String a[])
{
Ut t1=new Ut();
Thread ob=new Thread(t1);
ob.start();
}
}
class Ut implements Runnable
{
public void run()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
for(int i=1;i<11;i++)
{
System.out.println((i*num));
}
}
}
