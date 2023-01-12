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
C cObj=new C();
cobj.test();
cobj.show();
}
}
