import java.util.Scanner;
class Intrest
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
double amount;
double principle;
double rate;
double time;

System.out.println("Enter the principle amount:");
principle=in.nextDouble();
System.out.println("Enter the rate:");
rate=in.nextDouble();
System.out.println("Enter the time:");
time=in.nextDouble();

amount=principle*Math.pow((1+rate/100),time);
System.out.println("compoundintrest is:"+amount);
}
}
