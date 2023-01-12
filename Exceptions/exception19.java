class Emp
{
int id=100;

void show()
{
System.out.println("Test");
}
}
class Main
{
public static void main(String args[])
{
Emp eRef=null;
System.out.println(eRef);

if(eRef!=null)
{
System.out.println(eRef.id);
eRef.show();
return;
}
System.out.println("null");
}
}

