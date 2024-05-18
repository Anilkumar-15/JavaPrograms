import java.util.Scanner;
class PeakElement
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the size of array");
n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int y,j,x;
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.print(" " + a[i]);
if(i==n-1)
{
System.out.println();
}
}
if(n==1)
{
System.out.println("Please Enter more than one element");
}
for(int i=1;i<n;i++)
{
if(a[i]>a[i-1] && a[i]>a[i+1])
{
x=a[i];
System.out.println(" " + x);
}

}
}
}
