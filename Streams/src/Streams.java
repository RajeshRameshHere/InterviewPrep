import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int experienceYears;
    private double salary;

    public Employee(String name, int experienceYears, double salary) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    } 
}

public class Streams {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 7, 50000));
        employees.add(new Employee("Alice", 3, 45000));
        employees.add(new Employee("Bob", 6, 55000));
        employees.add(new Employee("Jane", 8, 60000));

        // Increase salary for employees with more than 5 years of experience using Stream API and lambda expression
        employees.stream()
                 .filter(emp -> emp.getExperienceYears() > 5)
                 .forEach(emp -> emp.setSalary(emp.getSalary() + 10000));

        // Print the updated salaries
        System.out.println("Updated salaries:");
        employees.forEach(emp -> System.out.println(emp.getName() + ": $" + emp.getSalary()));
    }
}
