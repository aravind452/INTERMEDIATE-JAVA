package OOPS;

import java.util.*;

public class Aggregation {

  public static void main(String[] args) {
    Employee emp = new Employee("aravind");
    Dept d = new Dept();
    d.addEmp(emp);
    d.showEmp();
    d = null;
  }

}

class Employee {
  private String name;

  Employee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

class Dept {

  private List<Employee> employees;

  Dept() {
    this.employees = new ArrayList<>();
  }

  public void addEmp(Employee emp) {
    this.employees.add(emp);
  }

  public void showEmp() {
    for (Employee emp : employees) {
      System.out.println(emp.getName());
    }
  }
}