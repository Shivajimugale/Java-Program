import java.util.*;
class Main
{
public static void main(String args[])
{
LinkedList<String>ll=new LinkedList<String>();

ll.add("B");
ll.add("C");
ll.add("D");
ll.add("E");
ll.add("Y");
System.out.println(ll.size());
System.out.println(ll);

ll.addfirst("A");
ll.addlast("Z");
System.out.println(ll.containts("D"));
ll.remove("D");
System.out.println(ll.containts("D"));
ll.remove(2);
System.out.pritnln(ll.containts("C"));
System.out.println(ll.getfirst());
System.out.println(ll.getlast());
}
}

