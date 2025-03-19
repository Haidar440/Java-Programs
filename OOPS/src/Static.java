public class Static {
    static void method1(){
        System.out.println("This is Static");
    }
    void method2(){
        System.out.println("This is non Static method");
    }
    public static void main(String[] args) {
        method1();
        Static obj = new Static();
        obj.method2();
    }
}
