class Main
{
public static void main(String args[])
{
Integer i1=new Integer(10);
Integer i2=new Integer(10);

if(i1==i2)
{
System.out.println("same reference");
}
else
{
System.out.println("difference reference");
}
if(i1.equals(i2))
{
System.out.println("same content");
}
else
{
System.out.println("different content");
}
}
}

