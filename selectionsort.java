import java.util.*;
class Selection
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the element of array");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("The array before sort=");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
for(int i=0;i<n;i++)
{
int min=a[i];
for(int j=i+1;j<n;j++)
{
if(min>a[j])
{
min=a[j];
}
else
{
continue;
}
System.out.println(min);

}

}
}
}