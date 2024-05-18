import java.util.*;
class BinarySearch
{
public static void main(String args[])
{
System.out.println("Welcome Sir, This programe is for Binary search, so please provide input according to given message");
System.out.println();
Scanner sc=new Scanner(System.in);
int n,item,i;
int b;
int mid;
System.out.println("Enter the size of array");
n=sc.nextInt();
int x[]=new int[n];
System.out.println("Enter the element of array");
for( i=0;i<n;i++)
{
x[i]=sc.nextInt();
}
System.out.println("Enter the item that you want to search");
item=sc.nextInt();
try
{
if(n==1)
{
if(item==x[i])
{
System.out.println("The item is " + item + " at the postion 1");
}
}
}
catch(Exception e)
{
System.out.println("The item is not in elements");
}
int l=1;
b=n-1;
mid=(l+b)/2;
if(item==x[mid-1])
{
System.out.println("Element " + item + " at the position " + (mid));
}
else if(item==x[mid])
{
System.out.println("the Item " + item + " is at position " + (mid+1));
}
else if(item>x[mid])
{
while(item>x[mid])
{
l=mid+1;
mid=(l+b)/2;
if(item==x[mid])
{
System.out.println("the Item " + item + " is at position " + (mid+1));
break;
}
}
}
else if(item<x[mid])
{
while(item<x[mid])
{
b=mid-1;
if(item==x[b])
{
System.out.println("The item " + item + " is at position " + (mid));
break;
}
mid=(l+b)/2;
if(item==x[mid])
{
System.out.println("The item " + item + " is at position " + (mid+1));
break;
}
}
}
}
}