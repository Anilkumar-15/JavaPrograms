import java.util.*;
class BST
{
void insertNode()
{
System.out.println("Enter the Value of node");
int nod;
nod=sc.nextInt();
int ptr=&nod;
System.out.println("the address of node=" + ptr);
}
public static void main(String args[])
{
BST ins=new BST();
Scanner sc=new Scanner(System.in);
System.out.println("what do you want?");
System.out.println("press 1 for Traverse the Tree");
System.out.println("press 2 for Insert a node in the Tree");
System.out.println("press 3 for delete a node from the tree");
int a=sc.nextInt();
switch(a)
{
case 1:
{
System.out.println("You didn't insert any node so you have no tree " );

break;
}
case 2:
{
System.out.println("Please insert Root node");
ins.insertNode();
break;
}
case 3:
{
System.out.println("Delete");
break;
}
default:
{
System.out.println("You had not choose any operation so kindly choose an operation ");
break;
}
}

}
}
