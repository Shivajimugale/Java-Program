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

 employees.add(new Employee(1,"Scott",10000.0));

 employees.add(new Employee(2,"Rose",20000.0));

 employees.add(new Employee(3,"Mark",30000.0));

 employees.add(new Employee(4,"Bush",40000.0));

 employees.add(new Employee(5,"Peter",50000.0));
Double salarySum=
                 employees.stream()
                          .collect(Collectors.summingDouble(e->e.salary));

System.out.println("Sum of salaries:"+salarySum);

Integer sumEmpnos=employees.stream()
                    .collect(Collectors.summingInt(e->e.empno));

System.out.println("Sum of empNos:"+sumEmpnos);

Long count=employees.stream()
                     .collect(Collectors.counting());
System.out.println("Number of elements:"+count);
}
}

