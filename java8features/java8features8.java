import java.util.*;

class Main
{
public static void main(String args[])
{
ArrayList<String>list=new ArrayList< >();

//set<String>list=new Treeset<>();

Spliterator<String>spliterator=list.spliterator();

if(spliterator.hasCharacteristics(Spliterator.ORDERED))
{
System.out.println("ORDERED");
}
if(spliterator.hasCharacteristics(Spliterator.DISTINCT))
{
System.out.println("DISTINCT");
}
if(spliterator.hasCharacteristics(Spliterator.SORTED))
{
System.out.println("SORTED");
}
if(spliterator.hasCharacteristics(Spliterator.CONCURRENT))
{
System.out.println("CONCURRENT");
}
if(spliterator.hasCharacteristics(Spliterator.IMMUTABLE))
{
System.out.println("IMMUTABLE");
}
}
}

