import java.util.*;

class Employee implements Comparable<Employee> {
    String name;
    int salary;

    // Constructor
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Comparable implementation (sort by salary)
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.salary, other.salary);
    }

    // toString() for easy printing
    @Override
    public String toString() {
        return name + ":" + salary;
    }
}

public class EmployeeSalarySorting {
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Amit", 50000));
        employees.add(new Employee("Priya", 60000));
        employees.add(new Employee("Rohan", 45000));

        // Sort employees (ascending by salary)
        Collections.sort(employees);

        // Display result
        System.out.println("Sorted by salary: " + employees);
    }
}
