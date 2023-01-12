//public int lastIndexOf(char c);
//public int lastIndexOf(String s);
class Main
{
public static void main(String args[])
{
 String s1="Javaaaaa is aPL";
 int p1=s1.lastIndexOf('a');
 System.out.println(p1);//12


String s2="Java is a programmimg language,which is very very easy";
int p2=s2.lastIndexOf("Very");//Case sensitive
System.out.println(p2);//-1
}
}