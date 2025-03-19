class Fruit{
    Fruit(){
        System.out.println("I am Fruit Contructor");
    }
    Fruit(String name){
        System.out.println("Fruit Name is ::"+name);
    }
}
class Animal{
    Animal(){
        System.out.println("Animal Detail");
        System.out.println("--------------------");
    }
    Animal(String name,String breed,int price){
        System.out.println("Dog Name::"+name);
        System.out.println("Dog breed::"+breed);
        System.out.println("Dog_Price::"+price);
    }
}
public class Constrator {
    public static void main(String[] args) {
        Fruit obj = new Fruit();
        Fruit obj1 = new Fruit("Mango");
        Animal a1 = new Animal();
        Animal a2 = new Animal("Golu","Bulldog",6786706);
    }
}
