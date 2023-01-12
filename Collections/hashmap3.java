import java.util.*;

class Main
{
public static void main(String args[])
{
 HashMap<Integer,String> emps=new HashMap<Integer,String> ();
emps.put(1,"Scott");
emps.put(2,"Mark");
emps.put(3,"John");
emps.put(4,"Bush");
emps.put(null,"Bush");

System.out.println(emps);
Set entries=emps.entrySet();
Iterator itr=entries.iterator();
while(itr.hasNext())
{
Map.Entry entry=(Map.Entry)itr.next();
Integer key=(Integer)entry.getKey();
String value=(String)entry.getValue();
System.out.println(key+" "+ value);
}
}
}
