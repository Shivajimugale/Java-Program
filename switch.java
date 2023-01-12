
import java.util.scanner;

class Main{
public static void main(String args[])
{
Scanner.in=new scanner(System.in);
int choice,x,y,result;
do
{
System.out.println("1) Addition");
System.out.println("2)subtraction");
System.out.println("3)multiplication");
System.out.println("4)division");
System.out.println("5)exit");

System.out.println("enter your choice");

choice=in.nextInt();
if(choice==5)
{
return;
}
if(choice>5)//(choice<1)
{
continue;
}
Sytem.out.println("enter x value");
x=in.nextInt();
System.out.println("enter y value");
y=in.nextInt();

switch(choice)
{
case1:
result= add(x,y);
System.out.println("sum:"+result);
break;

case2:
result=substaction(x,y);
System.out.println("substaction:"+result);
break;

case3;
result=multiply(x,y);
System.out.println("product:"+result);
break;

case4:
result=division(x,y);
System.out.println("quotient:"+result);
}
}while(true);
}

static int add(int x,inty)
{
return(x+y);
}
static int subtraction(intx,inty)
{
return(x-y);
}
static int multiplication(intx ,inty)
{
return(x*y);
}
static int division(intx,inty)
{
return(x/y);
}
}