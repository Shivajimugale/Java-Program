interface Test
{
 void test();
}
class X
{
 void show()
  {
   System.out.println("Non-static method");
  }
}
class Main
{
public static void main(String args[])

{
 X x=new X();
  Test t=x::show;
  t.test();
  
  t=new X()::show;
  t.test();
}
}

