class Main
{
public static void main(String args[])
{
System.out.println("main starts......");
 
try
{
int x=25/0;
System.out.println("result:"+x);
}
catch(ArithmeticException ae)
{
 System.out.println("Division error");
}
finally
{
System.out.println("finally block");
}
System.out.println("main ends");
}
}