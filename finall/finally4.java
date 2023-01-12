class Main
{
public static void main(String args[])
{
 try
 {
   int x=25/2;
 }
 catch(ArithmeticException ae)
 {
  System.out.println("catch block");
  }
  fianally
  {
 System.out.println("finally-1");
 }
fianlly
{
System.out.println("finally-2");
  }
 }
}
