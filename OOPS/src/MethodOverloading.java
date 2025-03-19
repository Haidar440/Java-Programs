class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(45,67));
        System.out.println(obj.add(60,30,10));
    }
}
