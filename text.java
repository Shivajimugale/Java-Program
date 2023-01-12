class Employee
{
private int empid;
private String name;
private double salary;

Employee(int empid,String name,double salary)
{
this.empid=empid;
this.name=name;
this.salary=salary;
}
}
class Main
{
public static void main(String args[])
{
Employee e=new Employee(1,"Scott",25000.0);
System.out.println(e.empid);
System.out.println(e.name);
sytem.out.println(e.salary);
}
}