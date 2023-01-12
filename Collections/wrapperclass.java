class Main
{
public static void main(String args[])
{
int num1=0;
int num2=0;
int Sum=0;

float Fnum1=0;
float Fnum2=0;
float FSum=0;

num1=Integer.parseInt(args[0]);
num2=Integer.parseInt(args[1]);
sum=num1+num2;
System.out.println(The Integer sum is:"+ Sum);

fnum1=Float.parseFloat(args[0]);
fnum2=Float.parseFloat(args[1]);

fSum=fnum1+fnum2;

System.out.println("The Float sum is:"+ fSum);
}
}