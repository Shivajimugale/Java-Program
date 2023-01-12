class Main
{
public static void main(String args[])
 {
 System.out.println("Main");
 try
 {
  System.out.println("Try starts");
  int r=24/2;
 if(2>1)
  {
  return;
  }
   System.out.println("Try ends");
  }
  catch(ArithmeticException ae)
  {
  System.out.println("Catch starts");
  }
 finally
 {
 System.out.println("Main ends");
 }
}

