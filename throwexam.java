class ExTest
{
void validate(int x) throws Exception
{
if(x<0)
{
throw new ArithmaticException();
}
else
{
System.out.println("valid no");
}
}
public static void main(String args[])
{
ExTest ob=new ExTest();
try
{
ob.validate(10);
}
catch(ArithmaticException e)
{
System.out.println("The value of x is less than zero");
}
}
}