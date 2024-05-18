import java.util.Scanner;
class SmallEle
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a[]= new int[5];
int i,j;
System.out.println("Enter five elements=");
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
for(j=0;j<5;j++)
{
if(a[j]>a[j+1])
{
a[j]=a[j]+a[j+1];
a[j+1]=a[j]-a[j+1];
a[j]=a[j]-a[j+1];
}
}
for(i=0;i<5;i++)
{
System.out.print(" " + a[i]);
}
}
}