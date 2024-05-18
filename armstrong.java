import java.util.Scanner;
class Armstrong
{
public static  int count(int n)
{
int c=0,x;
int i=0;
while(i<n)
{
c=c+1;
n=n/10;
}
return c;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number = ");
int l=sc.nextInt();
int o=l;
int sum,b,u,k,p=1;
sum=0;
u=count(o);
for(k=0;k<u;k++)
{
b=o%10;
int j=0;
while(j<u)
{
p=b*p;
j++;
}
o=o/10;
sum=p+sum;
p=1;
}
if(sum==l)
{
System.out.println("The given number is armstrong");
}
else
{
System.out.println("not");
}
}
}
