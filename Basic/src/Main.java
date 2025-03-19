import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FirstName");
        String fname = sc.nextLine();
        System.out.println("Enter Lastname");
        String lname = sc.nextLine();
        System.out.println("Enter Sid");
        String sid = sc.nextLine();
        System.out.println("Enter CGPA");
        float CGPA = sc.nextFloat();

        System.out.println("All Detail are Here");
        System.out.println("Name:"+fname+" "+lname);
        System.out.println("Id:"+sid);
        System.out.println("CGPA"+CGPA);


    }
}