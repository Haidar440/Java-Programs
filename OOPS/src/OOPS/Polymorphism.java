package OOPS;

class MethodOverloding{
    public static void add(int a, int b){
        System.out.println("Addition:"+(a+b));
    }
    public static  void add(double a,double b){
        System.out.println("Addition:"+(a+b));
    }
}

class Company{
    void displayInfo(){
        System.out.println("This is Company Info");
    }
}
class Manager extends Company{
    int id;
    String name;
    Manager(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    void displayInfo(){
        System.out.println("Manager ID: " + id);
        System.out.println("Manager Name: " + name);
    }
}

class Employee extends Company{
    int employee_id;
    String name;
    Employee(int employee_id,String name){
        this.employee_id =employee_id;
        this.name = name;
    }
    @Override
    void displayInfo(){
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Employee name: " + name);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
       MethodOverloding.add(10,20);
       MethodOverloding.add(6.7,7.8);

        Company mgr = new Manager(101, "John Doe");
        mgr.displayInfo();  // Calls Manager's displayInfo()

        System.out.println("----------------------");

        // Creating an Employee object
        Company emp = new Employee(201,"Haidar");
        emp.displayInfo();  // Calls Employee's displayInfo()
    }

}
