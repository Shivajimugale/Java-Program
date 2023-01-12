import java.util.
employees.add(new Employee(1,"Scott",10000);
employees.add(new Employee(2,"Rose",20000);
employees.add(new Employee(3,"Mark",30000);
employees.add(new Employee(4,"Bush",40000);
employees.add(new Employee(5,"Peter",50000);

double totalSalary=employees.stream()
                   .map(emp->emp.salary)
                   .reduce(0.0,(sum,sal)->sum+sal);
accumulating salary
System.out.println(totalSalary);

//More precise code
Double totalSalary2=employees.stream()
                     .map(emp->emp.salary)
                      .reduce(0.0,Double::sum);

using sum method of 
