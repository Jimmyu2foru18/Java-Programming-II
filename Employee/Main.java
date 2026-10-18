import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the Employee class using user input
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter employee position: ");
        String position = scanner.nextLine();

        System.out.print("Enter employee salary: $");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, employeeId, position, salary);

        System.out.println("Employee Information:");
        displayEmployeeInfo(employee);

        // Test method overloading with a salary increase
        System.out.print("\nEnter the percentage to increase salary by: ");
        double percentage = scanner.nextDouble();

        double updatedSalary = employee.increaseSalary(percentage);
        System.out.println("\nEmployee Information after salary increase:");
        displayEmployeeInfo(employee);

        System.out.println("\nUpdated Salary: $" + updatedSalary);

        scanner.close();
    }

    static void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Salary: $" + employee.getSalary());
    }
}

class Employee {
    private String name;
    private int employeeId;
    private String position;
    private double salary;

    // Default constructor with default values
    public Employee() {
        this.name = "John Doe";
        this.employeeId = 1000;
        this.position = "Employee";
        this.salary = 40000.0;
    }

    // Parameterized constructor
    public Employee(String name, int employeeId, String position, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            // Set a default salary if the provided salary is negative
            this.salary = 40000.0;
        }
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method overloading to increase salary
    public double increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
        return salary;
    }
}

