import java.util.Scanner;
class Main
{

public static void main(String args[])
{
int n;
System.out.println("enter term number");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i>=n;i=i+2)
{
System.out.println(i+" ");
}
}
}