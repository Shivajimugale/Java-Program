class Main
{
public static void main(String args[])
{
try
{
System.out.println("hello");

if(2>1)
{
throw new ArithmeticException();
}
System.out.println("test");
}
catch(ArithmeticException ae)
{
System.out.println("Division error");
}
}
}
