class Main
{
public static void main(String args[])
{
  finally
  {
  System.out.println("finallyblock");
  }
  try
 {
 int x=24/2;
 System.out.println(x);
 }
 catch(ArithmeticException ae)
 {
  System.out.println("catch block");
 }
}
}


