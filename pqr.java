class Abc
{
int a,b;
Abc(int j,int k)
{
a=j;
b=k;
}
}
class Xyz extends Abc
{
int x,y;
Xyz(int j,int k)
{
super(a,b);
x=j;
y=k;
}
}
class Pqr
{
public static void main()
{
Xyz ob=new Xyz();
ob.Xyz(13,12,11,10);
}
}