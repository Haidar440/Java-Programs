class Calculator{
    int add(int a, int b){
        return a + b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
class Animal1{
    void sound(){
        System.out.println("This Animal make Sound");
    }
}
class Rabbit extends Animal1{
    @Override
    void sound(){
        System.out.println("This is Rabbit Sound");
    }
}
class Horse extends Animal1{
    @Override
    void sound(){
        System.out.println("This is Horse Soubnd");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
       Animal1 myAnimal;
       myAnimal = new Rabbit();
       myAnimal.sound();
       myAnimal = new Horse();
       myAnimal.sound();

       Calculator mycal = new Calculator();
        System.out.println(mycal.add(3,4));
        System.out.println(mycal.add(5,6,7));
    }
}
