import java.util.*;
class Bubble
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,temp;
System.out.println("Enter the size of array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the element");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.println(" " + a[i]);
}
for (int i=0;i<n;i++)
{
for(int j=i;j<n-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(int i=0;i<n;i++)
{
System.out.print(" " + a[i]);
}
}
}


