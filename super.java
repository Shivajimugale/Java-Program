class P
{
P()
{
System.out.println("PDC");
}

}
class C extends P
{
 int i;
C(int i)
{
 super();
this.i=i;

System.out.println("CPC");

}

}
class Main
{
public static void main(String args[])
{
C c=new C(10);

}
}