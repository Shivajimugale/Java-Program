abstract class P
{
void test()
{
System.out.println("test");
}
 abstract void show();

}
class C extends  P
{
void show()
{
System.out.println("Concrete show()");
 }
}
class Main
{
public static void main(String args[])
{
C c Obj=new C();
c obj.test();
c obj.show();
}
}
