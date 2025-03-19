import java.util.Scanner;
public class Control_Statement {
    public static void main(String[] args) {
        System.out.println("Enter Unit Consumed");
        Scanner scan = new Scanner(System.in);
        int unit = scan.nextInt();
        float bill = 0;
        if(unit<=200){
            bill = (int) (unit*0.50);
        }
        else if (unit<=400) {
            bill = (int)(unit*0.65)+100;
        }
        else if (unit<=600) {
            bill = (int)(unit*0.80)+200;
        }
        else{
            bill=(int)(unit*1.25)+425;
        }
        System.out.println(bill);
    }

}
