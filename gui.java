import java.awt.*;
class First extends Frame
{
First()
{
Frame f=new Frame();
Button b=new Button("click me");
b.setBounds(30,100,80,30);
Label l1=new Label("User id");
Label l2 = new Label("Password");
TextField t1=new TextField();
add(b);
l1.setBounds(30,100,80,30);
l2.setBounds(30,100,80,30);
t1.setBounds(30,100,80,30);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main(String args[])
{
First f=new First();
}
}