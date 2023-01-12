import java.util.*;
class Main
{
public static void main(String args[])
{
ArrayList<String>fruits=new ArrayList<String>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Cherry");
System.out.println(fruits);
List<String> al=Collections.synchronizedList(fruits);
if (fruits==al)
{
System.out.println("Same reference");
}
else
{
System.out.println("Difference references");
}
}
}
