class Main{
public static void main(String args[])
{
int i=1;
 i=++i*++i*++i*++i;
System.out.println(i);

i=1;
i=i++*++i*i++*++i;
System.out.println(i);

i=0;
i=i++*--i*++i*i--;
System.out.println(i);

}
}