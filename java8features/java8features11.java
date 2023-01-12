import java.util.*;
import java.util.stream.Collectors;

class Main
{
  public static void main(String args[])
 {
 List<String>fruits=Arrays.asList("orange","apple","mango",
                                   "banana","cherry","dates","mango");
TreeSet<String>result=fruits.stream()
                             .map(String::toUpperCase)
                             .collect(Collectors.toCollection(TreeSet::new));

System.out.println(result);
}
}
