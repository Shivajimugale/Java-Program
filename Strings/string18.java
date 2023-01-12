//public string substring(int startindex)
//public String substring(int startindex,int endindex)

class Main
{
public static void main(String args[])
{
String s="George Bush";
String r1=s.substring(0);
System.out.println(r1);

if(s==r1)
{
System.out.println("same references");
}
else
{
System.out.println("Difference references");
}
String r2=s.substring(0,6);
System.out.println(r2);

String r3=s.substring(0,12);//Exception
System.out.println(r3);

}
}
