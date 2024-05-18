class Mythread implements Runnable
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("klsdfa");
}
}
}
class Mthread
{
public static void main(String args[])
{
Mythread ob=new Mythread();
Thread t=new Thread(ob);
t.start();
for(int i=0;i<10;i++)
{
System.out.println("lkdalkfa");
}
}
}
