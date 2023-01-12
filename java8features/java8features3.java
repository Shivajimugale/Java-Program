import java.util.*;

class Main
{
public static void main(String args[])
{
Set<String> fruits=new HashSet<String>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Cherry");
fruits.add("Dates");
fruits.add("Eggfruit");
fruits.add("Dates");

fruits.forEach((fruit)->System.out.println(fruits));
}
}
