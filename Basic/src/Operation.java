import java.util.Scanner;
public class Operation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int s1 = 0;
        s1+=number%10;
        number = number/10;
        s1+=number%10;
        number= number/10;
        s1+=number%10;
        System.out.println(s1);

    }
}
