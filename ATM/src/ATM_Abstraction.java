import java.util.Scanner;

abstract class ATM{
    double balance;
    ATM(double balance){
        this.balance = balance;
    }
    abstract void withdraw(double balance);
    abstract void deposit(double balance);
    abstract void checkBal();
}
class SBI extends ATM{
    SBI(double balance){
        super(balance);
    }
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawl Success,Avl Balance::"+balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    //Deposit Method
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount Deposited Successfully!");
            System.out.println("Available Ammount::"+balance);
        }else{
            System.out.println("Invalid Amount");
        }
    }
    public void checkBal() {
        System.out.println("Your balance is: $" + balance);
    }
}
public class ATM_Abstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SBI obj = new SBI(60000);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.println("------------------------------------------");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> obj.checkBal();
                case 2 -> {
                    System.out.println("Enter amount to Deposit");
                    double depo_amt = scanner.nextDouble();
                    obj.deposit(depo_amt);
                }
                case 3 -> {
                    System.out.println("Enter amount to Withdraw");
                    double with_amt = scanner.nextDouble();
                    obj.withdraw(with_amt);
                }
                case 4 -> {
                    System.out.println("Thank you for using the ATM!");
                    exit=true;
                }
                default -> System.out.println("Invalid Option!");
            }
        }

    }
}