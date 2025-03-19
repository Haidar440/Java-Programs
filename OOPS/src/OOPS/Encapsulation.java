package OOPS;

public class Encapsulation {
    private static String name_1 = "Haidar ali";

    public String getName(){
        return name_1;
    }
}


class Main{
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        System.out.println(en.getName());
    }
}