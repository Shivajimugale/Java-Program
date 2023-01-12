import java.util.*;
import java.util.stream.*;

class Employee
{
int empno;
String ename;
double salary;

Employee(int empno,String ename,double salary)
{
 this.empno=empno;
 this.ename=ename;
 this.salary=salary;
}
} 

class Main
{
 public static void main(String args[])
{
 Set <Employee>employees=new HashSet<Employee>();

 employees.add(new Employee(1,"Scott",10000));

 employees.add(new Employee(2,"Rose",20000));

 employees.add(new Employee(3,"Mark",20000));

 employees.add(new Employee(4,"Bush",40000));

 employees.add(new Employee(5,"Peter",50000));

List<Double>employeeSalaryList=
                               employees.stream()
                                        .map(e->e.salary+1)
                                        .collect(Collectors.toList());//tolists is for creating
System.out.println(employeeSalaryList);

Set<Double>employeeSalarySet=
                               employees.stream()
                                        .map(e->e.salary+1)
                                        .collect(Collectors.toSet());//toset  is for creating
System.out.println(employeeSalarySet);
}
}

