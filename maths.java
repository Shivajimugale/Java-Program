class P
{
void test()
{
System.out.println("P-test()");
}
}
class C extends P
{
void test()
{
System.out.println("C-test()");
}
}
class Main
{
public static void main(String args[])
{
P p=new P();
p.test();

C c =new C();
c.test();
}
}
