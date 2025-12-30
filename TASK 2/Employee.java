public class Employee {

    // private variables
    private String name;
    private int id;
    private double salary;

    // constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // method to display details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    // main method
    public static void main(String[] args) {
        Employee emp = new Employee("Dharshini", 101, 25000);
        emp.displayDetails();
    }
}
