class Animal2{
}
class lynx extends Animal2{}
public class InstanceOf {
    public static void main(String[] args) {
        lynx mylynx = new lynx();
        System.out.println(mylynx instanceof Animal2);
    }
}
