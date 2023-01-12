class Emp implements Cloneable
{
int id;
Emp(){}
Emp(int id)
{
this.id=id;
}
protected Object clone()throws CloneNotSupportedException
{
return super.clone();
}
}
class Main
{
public static void main(String args[])throws CloneNotSupportedException
{

Emp e1=new Emp(1);
Emp e2=(Emp)e1.clone();

System.out.println(e1.id);

System.out.println(e2.id);

System.out.println(e1);

System.out.println(e2);
}
}