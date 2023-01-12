class febonaccirecur
{
static int fib(int n)
if(n==1//n==2)
  return 1;
else
  return(fib(n-1)+fib(n-2));
}
public static void main(String args[])
{
int n=9;
if(n<0)
{
System.out.println("Fibonacci no is not defained");
}
else
{
System.out.println(fib(n));
}

}
}


