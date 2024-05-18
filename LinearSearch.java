import java.util.*;
class LinearSearch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the size of array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int item;
System.out.println("enter the element you want to search");
item=sc.nextInt();
for(int i=0;i<n;i++)
{
if(item==a[i])
{
System.out.println("Element " + item + " found at position " + i);
}

}

}
}