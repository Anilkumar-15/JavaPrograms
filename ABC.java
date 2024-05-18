class ABC 
{
ABC(){
System.out.println("With did abc");
}
}
class XYZ extends ABC
{
XYZ(){
System.out.println("With did XYZ");
}
}
class PPP extends XYZ
{
PPP(){
System.out.println("With did PPP");
}
}
class Check
{
public static void main(String[] args)
{
PPP ob= new PPP();
}
}
