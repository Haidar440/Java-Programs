abstract class A1{
    abstract void sound();
    void sleep(){
        System.out.println("This Animal is sleeping");
    }
}
class D extends A1{
    void sound(){
        System.out.println("This is Dog Brak");
    }
}
class C extends A1{
    @Override
    void sound(){
        System.out.println("Moew Moew...");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        D dog = new D();
        dog.sound();
        dog.sleep();
        A1 cat = new C();
        cat.sound();
    }

}
