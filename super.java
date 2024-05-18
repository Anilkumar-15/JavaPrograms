class Test
{
Test()
{
System.out.println("this is parent class");
}
}
class Test1
{
public void show()
{
super();
System.out.println("this is child class");
}
}
class Final
{
public static void main(String args[])
{
Test ob=new Test1();
}
}
