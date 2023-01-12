class Main
{
public static void main(String args[])
{
byte val=10;
Byte bObj=new Byte(val);
byte b=bObj.byteValue();
short s=bObj.shortValue();
int i=bObj.intValue();
long l=bObj.longValue();
float f=bObj.floatValue();
double d=bObj.doubleValue();

System.out.println(b);

System.out.println(s);

System.out.println(i);

System.out.println(l);

System.out.println(f);

System.out.println(d);
}
}

