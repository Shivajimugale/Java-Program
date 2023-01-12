import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

class Main
{
public static void main(String args[])
{
TreeMap<String,String> tMap=new TreeMap<String,String>();

tMap.put("4","D");
tMap.put("3","C");
tMap.put("1","A");
tMap.put("5","E");
tMap.put("2","B");

System.out.println("Initial map contents:"+tMap);
System.out.println("\n");
System.out.println("value for key 2:"+tMap.get("2"));
tMap.remove("2");
System.out.println("\n");
System.out.println("contents after deleting key 2:"+tMap);

Set st=tMap.keySet();
Iterator itr=st.iterator();

System.out.println("\nTreeMap Contents");
while(itr.hasNext())
{
System.out.println(tMap.get((String)itr.next()));
}
//remove 1 from Set
st.remove("1");
System.out.println("\n key present? :" +tMap.containskey("1"));
System.out.println(tMap);
}
}





