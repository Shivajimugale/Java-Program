class Main
{
public static void main(String args[])
{
try
{
int x=25/5;
System.out.println(x);
}
finally
{
System.oyut.println("finally");
}
catch(ArithmeticException ae)
{
System.out.println("catch block");
}
}
}