import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner.in=new Scanner(System.in);
int choice,x,y,result;
do
{
System.out.println("1)Addition");
System.out.println("2)subtraction");
System.out.println("3)multiplication");
System.out.println("4)division");
System.out.println("5)exit");
System.out.println("enter your number");
choice=in.next.Int();
if(choice==5)
{
return;
}
if (choice>5)//(choice<1)
{
continue;
}

System.out.println("enter x value");
x=in.next Int();
System.out.println("enter y value");
y=in.next Int();

switch(choice)
{
case1:
result=add(x,y);
System.out.println("sum:"+result);
break;

case2:
result=substraction(x,y);
System.out.println("subtraction:"+result);
break;

case3:
result=multiply(x,y);
System.out.println("multiplication:"+result);
break;

case4:
result=division(x,y);
System.out.println("division:"+result)
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

static int multiplication(int x ,int y)
{
return(x*y);
}
static int division(int x,int y)
{
return(x/y);
}
}