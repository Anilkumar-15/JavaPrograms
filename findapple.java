class FindApple
{
public static void main(String args[])
{
int n=7;
int i,j;
for (i=j;i>=n;i++)
{
if(i%7==0)
{
 if(i%6==1)
 {
 if(i%5==1) 
{
if(i%4==1) 
{
if(i%3==1) 
{ 
if(i%2==1)
{
System.out.println(" " + i);
break;
}

}
}
}
}
}
}
}
}
