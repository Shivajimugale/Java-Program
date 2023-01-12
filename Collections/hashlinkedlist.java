import java.util.*;

class Main
{
public static void main(String args[])
{
LinkedHashMap<String,String> names=new LinkedHashMap<String,String>();
names.put("4",null);//multiple null values  permitted
names.put("2","Mark");
names.put("1","Scott");
names.put("3","John");
names.put(null,"Bush");
names.put(null,null);//only one null key permitted
names.put("1","Rose");//will replace the first entry

System.out.println(names);
}
}