import java.util.Scanner;

class Main
{
public static void main(String args[])
{
int x,y,z;
Scanner n=new Scanner(System.in);

System.out.println("enter the x value");
x=n.nextInt();
System.out.println("enter the y value");
y=n.nextInt();

try
{

z=x/y;
System.out.println("result:"+z);

}
catch(ArithmeticException ae)
{
System.out.println("y can't be zero");
main(null);
}
System.out.println("end");
}
}