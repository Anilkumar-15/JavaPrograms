class Final 
{
public static void main(String args[])
{
Test1 ob=new Test1();
ob.show();
}
}
class Test {
public void voice()
{
System.out.println("This is parent class");
}
}
class Test1 extends Test
{
public void show()
{
super.voice();
System.out.println("this is child");
}
}
