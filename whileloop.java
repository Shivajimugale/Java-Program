import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int choice,x,y,result;
do
{
System.out.println("1)Addition");
System.out.println("2)subtraction");
System.out.println("3)multiplication");
System.out.println("4)division");
System.out.println("5)exit");
System.out.println("enter your number");
choice=in.nextInt();
if(choice==5)
{
return;
}
if (choice>5)//(choice<1)
{
continue;
}

System.out.println("enter x value");
x=in.nextInt();
System.out.println("enter y value");
y=in.nextInt();

switch(choice)
{
case 1:
result=add(x,y);
System.out.println("sum:"+result);
break;

case 2:
result=subtraction(x,y);
System.out.println("Difference:"+result);
break;

case 3:
result=multiply(x,y);
System.out.println("Product:"+result);
break;

case 4:
result=quiotient(x,y);
System.out.println("Quotient:"+result);
}

}while(true);
}

static int add(int x ,int y)
{
return(x+y);
}
static int subtraction(int x,int y)
{
return(x-y);
}

static int multiply(int x ,int y)
{
return(x*y);
}
static int division(int x,int y)
{
return(x/y);
}
}