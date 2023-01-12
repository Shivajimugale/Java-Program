class Employee
{
int empid;
String name;
double salary;

Employee(int empid,String name,double salary)
{
this.empid=empid;
this.name=name;
this.salary=salary;
}
void show()
{
System.out.println(empid);
System.out.println(name);
System.out.println(salary);
}
}