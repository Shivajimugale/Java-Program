import java.util.*;

class Main
{
 public static void main(String args[])

{
ArrayList<String> fruits=new ArrayList<String>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Cherry");
fruits.add("Dates");
fruits.add("EggFruit");
fruits.add("Fig");
fruits.add("Grapes");
fruits.add("HoneyDew");

Spliterator<String>fruitsSplit1=fruits.spliterator();
Spliterator<String>fruitsSplit2=fruitsSplit1.trySplit();

fruitsSplit1.forEachRemaining(f -> System.out.println(f));
fruitsSplit1.forEachRemaining(System.out::println);
System.out.println();


fruitsSplit2.forEachRemaining(f -> System.out.println(f));
fruitsSplit2.forEachRemaining(System.out::println);
}
}

