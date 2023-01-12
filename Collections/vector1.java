class Main
{
public static void main(String args[])
{
vector<String> v=new vector<String>(4);
System.out.println(v.Capacity());

v.addElement("A");
v.addElement("B");
v.addElement("C");
v.addElement("D");
v.addElement("E");

System.out.pritnln(v);

System.out.pritnln(v.Capacity());


v.addElement("F");
v.addElement("G");
v.addElement("H");
v.addElement("I");
System.out.println(v.capacity());
Enumeration e=v.elements();
while(e.hasNext())
{
String s=(String)e.nextElement();
System.out.println(s);
}
}
}
