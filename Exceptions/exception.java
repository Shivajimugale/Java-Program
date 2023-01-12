import java.io.*;
class Main
{
public static void main(String args[])
{
int x=25;
int y=2;
int r=0;
try
{
  try
  {
   System.out.println("Enter the value");
   y=Interger.parseInt(dis.readLine());
   r=x/y;
   System.out.println(r);
  }
catch(IOException ioe)
{
ioe.printStackTrace();
}
catch(ArithmeticException ae)
{
 System.out.println("Nested one");
 main(null);
return;
}
catch(ArithmeticException ae)
{

System.out.println("Enter non_negative values");
main(null);
}

System.out.println("End");

}
}