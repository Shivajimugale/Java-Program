//public string replace(char old ,char new)
//public string replace(String old,String new)
class Main
{
public static void main(String args[])
{
   String s1="Mangalore";
   String r1=s1.replace('M','B'); 
   System.out.println(r1);
   System.out.println(s1.replace('M','B'));
   System.out.println(s1);

   r1=s1.replace('a','i');
   System.out.println(r1);


String s2="java is difficult language";
r1=s2.replace("difficult","easy");

System.out.println(r1);
System.out.println(s2);

s2=s2.replace("difficult","easy");
System.out.println(s2);
}
}



  

