import java.util.*;
class Text1
{
 static String popChar(String l,char m)
{
String s="";
for(int i=0;i<l.length();i++)
{
if(l.charAt(i)!=m)
{
s=s + l.charAt(i);
}
}
return s;
}
 public static  void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a;
String str;
char ch;
System.out.println("Enter the string");
str=sc.nextLine();
System.out.println("Enter the character");
ch=sc.next().charAt(0);
a = popChar(str,ch);
System.out.println(a);
}
}