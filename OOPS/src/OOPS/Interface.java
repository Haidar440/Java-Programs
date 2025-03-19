package OOPS;

// Interface defining employee details
interface EmployeeDetails {
    void displayEmployee();
}

// Employee class implementing the EmployeeDetails interface
class Employee_1 implements EmployeeDetails {
    private int empId;
    private String name;
    private double salary;
    private String location;
    private String phone;

    // Constructor
    public Employee_1(int empId, String name, double salary, String location, String phone) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.location = location;
        this.phone = phone;
    }

    // Implementing the displayEmployee method
    @Override
    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Location: " + location);
        System.out.println("Phone: " + phone);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Creating Employee objects
        Employee_1 emp1 = new Employee_1(101, "Haidar Ali", 50000, "Bengaluru", "9876543210");
        Employee_1 emp2 = new Employee_1(102, "John Doe", 60000, "Mumbai", "9876543211");

        // Displaying Employee Details
        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}
