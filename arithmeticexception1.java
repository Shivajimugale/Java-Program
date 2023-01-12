class Main
{
public static void main(String args[])
{
try
{
 int res=Calculation.divide();
 System.out.println(res);
 }
catch(ArithmeticException ae)
{
System.out.println("/Error");
}
}
}
class Calculation
{
static int divide() throws ArithmeticException
{
int r=25/2;
return r;
}
}