import java.util.ArrayDeque;
import java.util.Iterator;
class Main
{
public static void main(String... args){ //Var-args feature

 ArrayDeque<String> aq=new ArrayDeque<String>();
 aq.add("A");
 aq.add("B");
 aq.add("C");
 System.out.println(aq);

//offerFirst-adds elements at the front of the ArrayDeque
  aq.offerFirst("D");

//offerFirst-adds elements at the front of the ArrayDeque
   aq.offerLast("E");
   System.out.print(aq);
   aq.poliFirst();
   aq.poliLast();
  System.out.println(aq);
  Iterator<String> itr=aq.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}


 


    


  

