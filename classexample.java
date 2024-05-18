class customer
{
int cid;
String name;
double bal;
void setInfo(int id, String n, double b)
{
cid=id;
name=n;
bal=b;
}
void deposite(int amt)
{
bal= bal+amt;
System.out.println("The "  + amt + " is deposite in your account.");
}
void withdraw(int amt)
{
bal=bal-amt;
System.out.println("The remaining balance=" + bal);
}
void display()
{
System.out.println("cid=" + cid);
System.out.println("name=" + name);
System.out.println("balance=" + bal);
}
}
class Ctest
{
public static void main(String A[])
{
customer c1= new customer();
c1.setInfo(100,"Anilkumar",9874632);
c1.deposite(1000);
c1.withdraw(100);
c1.display();

}
}
