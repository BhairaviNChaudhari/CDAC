package a7.Assignment.oop;

//3.	Design and implement a class named Employee to manage employee data for a company. The class should include fields to keep track of the total number of employees and the total salary expense, as well as individual employee details such as their ID, name, and salary.
//The class should have methods to:
//•	Retrieve the total number of employees (getTotalEmployees())
//•	Apply a percentage raise to the salary of all employees (applyRaise(double percentage))
//•	Calculate the total salary expense, including any raises (calculateTotalSalaryExpense())
//•	Update the salary of an individual employee (updateSalary(double newSalary))
//Understand the problem statement and use static and non-static fields and methods appropriately. Implement static and non-static initializers, constructors, getter and setter methods, and a toString() method to handle the initialization and representation of employee data.
//Write a menu-driven program in the main method to test the functionalities.

import java.util.*;

public class Employee {
    // Static fields
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0;

 
    private int id;
    private String name;
    private double salary;

  
    static {
        System.out.println("Employee Management System Initialized");
    }

    // Constructor
    public Employee(String name, double salary) {
        this.id = ++totalEmployees;
        this.name = name;
        this.salary = salary;
        totalSalaryExpense += salary;
    }

 
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }


    public static int getTotalEmployees() {
        return totalEmployees;
    }


    public void updateSalary(double newSalary) {
        totalSalaryExpense -= this.salary;
        totalSalaryExpense += newSalary;
        this.salary = newSalary;
    }

    public static void applyRaise(ArrayList<Employee> employees, double percentage) {
        for (Employee emp : employees) {
            double newSalary = emp.getSalary() * (1 + percentage / 100);
            emp.updateSalary(newSalary);
        }
    }

    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + name + ", Salary: $" + salary + "]";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Apply Raise to All Employees");
            System.out.println("5. Display Total Employees and Salary Expense");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    employees.add(new Employee(name, salary));
                    System.out.println("Employee added successfully!");
                    break;
                case 2:
                    for (Employee emp : employees) {
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    for (Employee emp : employees) {
                        if (emp.getId() == id) {
                            emp.updateSalary(newSalary);
                            System.out.println("Salary updated successfully!");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter raise percentage: ");
                    double percentage = scanner.nextDouble();
                    applyRaise(employees, percentage);
                    System.out.println("Raise applied successfully!");
                    break;
                case 5:
                    System.out.println("Total Employees: " + getTotalEmployees());
                    System.out.printf("Total Salary Expense: $%.2f%n", calculateTotalSalaryExpense());
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}