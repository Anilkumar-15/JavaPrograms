class Bank
{
int getRateOfInterest()
{
return 0;
}
}
//Creating child classes.
class SBI extends Bank
{
int getRateOfInterest()
{
return 8;
}
}
class ICICI extends Bank{
int getRateOfInterest()
{
return 7;
}
}
class Test
{
public void main(String args[])
{
SBI s = new SBI();
ICICI i = new ICICI();
AXIS a = new AXIS();
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
}
}
class AXIS extends Bank
{
int getRateOfInterest()
{
return 9;
}
}
