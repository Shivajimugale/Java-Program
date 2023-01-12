package p1;
import p1.p11.B;

public class A
{
private int x=10;
public void show()
{
System.out.println(x);
B b =new B();
b.display;
}
}
package p1.p11;

import p1.A;
public class B
{
private int y=20;
public void display()
{
System.out.println(y);
}

A a=new A();
a.show();
}

import p1.A;
import p1.p11.B;
class Main
{
public static void main(String args[])
{
A a =new A();
a.show();
B b =new B();
b.display();
}
}

