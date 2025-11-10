package PracticalMental;
import java.util.ArrayList;

class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    // override calculateSalary()
    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

public class Company {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 900));
        employees.add(new Manager("Bob", 800, 300));
        employees.add(new Manager("Charlie", 950, 200));
        employees.add(new Employee("David", 700));

        System.out.println("Employees with total salary > 1000:");
        for (Employee e : employees) {
            double total = e.calculateSalary();
            if (total > 1000) {
                System.out.println(e.name + " : " + total);
            }
        }
    }
}
