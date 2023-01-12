interface Test
{
void test();
}
class X
{
 static void show()
 {
System.out.println("Static method references");
 }

}
class Main
{
public static void main(String args[])
{
  Test t=X::show;
  t.test();
 }
}
