package OOPS;

import java.util.Scanner;

abstract class Softwares {
    String user_name;
    String password;

    void user_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        user_name = sc.nextLine();
        System.out.println("Enter Password");
        password = sc.nextLine();
    }

    void user_login() {
        System.out.println("WELCOME TO THE APPLICATION");
        System.out.println("-------------------------");
        System.out.println("Please Login Here...!!");
    }

    abstract void aap_open();
}

class Instagram extends Softwares {
    @Override
    void aap_open() {
        if (user_name.equals("Haidar") && password.equals("8980661175")) {
            System.out.println("Successfully Logged In, Instagram is Open...");
        } else {
            System.out.println("Invalid Username & Password");
        }
    }

    void app_close() {
        System.out.println("Instagram is Closed...");
    }
}

class Whatsapp extends Softwares {
    String phone_number;
    String otp;

    @Override
    void user_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone Number");
        phone_number = sc.nextLine();
        System.out.println("Enter OTP");
        otp = sc.nextLine();
    }

    @Override
    void aap_open() {
        if (phone_number.equals("9876543210") && otp.equals("1234")) {
            System.out.println("Successfully Logged In, WhatsApp is Open...");
        } else {
            System.out.println("Invalid Phone Number or OTP");
        }
    }

    void app_close() {
        System.out.println("WhatsApp is Closed...");
    }
}

public class Apps {
    public static void main(String[] args) {
        Instagram insta = new Instagram();
        insta.user_login();
        insta.user_input();
        insta.aap_open();

        System.out.println("\nSwitching to WhatsApp...\n");

        Whatsapp whatsapp = new Whatsapp();
        whatsapp.user_login();
        whatsapp.user_input();
        whatsapp.aap_open();
    }
}
