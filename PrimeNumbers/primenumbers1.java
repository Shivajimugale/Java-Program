class Prime12
{
public void display()
{
int i,j;
String primeno="";
for(i=2;i<100;i++)
{
int count=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
count=1;
break;
}
}

if(count==0)
{
primeno=primeno+i+"";
System.out.println(i);
}
}

public static void main(String args[])
{
display();
System.out.println("prime numbers 1 to 100");
System.out.println(primeno);


}
}