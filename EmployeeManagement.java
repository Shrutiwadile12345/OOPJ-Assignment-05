import java.util.*;

class Employee{

     private String name;
	 private double salary;
	 
	 public Employee(String name, double salary){
	    this.name = name;
		this.salary = salary;
	 }
	 
	 public String getname(){
	    return name;
	 }
	 
	  public double getsal(){
	    return salary;
	 }
	 
	 public String toString(){
	    return name + ":" + salary;
	 }
}

public class EmployeeManagement{

    public static void main(String args[]){
	
	List<Employee> employees = new ArrayList<>();
	
	employees.add(new Employee("Amit", 50000));
	employees.add(new Employee("Priya", 60000));
	
	System.out.println("Employee List: ");
	for(Employee emp : employees){
	   System.out.println(emp + ",");
	}
  }
}