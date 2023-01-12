class Prime
{
public static void main(String args[])
{
int n=9;
boolean prime=false;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
prime=true;
break;
}
}
if (!prime)

System.out.println(n +"is prime number");
else
System.out.println(n +"is not prime number");
}
}


