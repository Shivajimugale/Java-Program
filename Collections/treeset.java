import java.util.*;
class Employee
{
 int   empid;
String empName;
String empAdd;
public Employee(int eid,String eName,String eAdd)
{
empid=eid;
empName=eName;
empAdd=eAdd;
}
public String toString()
{
return("\nempid:"+empid+"\n empName:"+empName+"\n empAdd:"+empAdd);
}
}
class Mycomp implements Comparator
{
public int compare(Object Obj1,Object Obj2)
{
Employee emp1;
Employee emp2;
emp1=(Employee)Obj1;
emp2=(Employee)Obj2;

if(emp2.empid==emp1.empid)
{
return 0;
}
else if(emp2.empid>emp1.empid)
{
return -1;
}
else return 1;
}
}
class Main
{
public static void main(String args[])
{
TreeSet<Employee> ts= new TreeSet<Employee>(new MyComp());
Employee emp2=new Employee(002,"Bob","Mumbai");

Employee emp1=new Employee(001,"John","Chennai");

Employee emp3=new Employee(003,"Raj","Kolkatta");

Employee emp4=new Employee(003,"Scott","UP");

ts.add(emp3);

ts.add(emp1);

ts.add(emp2);

ts.add(emp4);
Iterator itr=new Iterator();

while(itr.hasNext())
{
Employee emp= (Employee)itr.next();
System.out.println(emp);
System.out.println("\n");
}
}
}


 
