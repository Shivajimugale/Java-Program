class Main
{
public static void main(String args[])
{
try
{
class.forName("Main")
{
int x=1;
if(x==1)
{
throw new illegalAccessException();
}
if(x==2)
{
throw new InstatiationException();
}
}
catch(classNotFoundException|IllegalAccessException|InstatiationException ie)
{
System.out.println("Commonholder");
ie.printStackTrace();
}
}
}
