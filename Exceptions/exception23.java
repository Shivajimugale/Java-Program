package bnk;
import java.util.Scanner;

public static void withdraw()throws InsufficientFundsException
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the amount");
double amount=in.nextDouble();

if(amount>10000.0)
{
thrown new InsufficientFundsException();
}
else
{
SYstem.out.println("collect your cash....");
}
}
}
