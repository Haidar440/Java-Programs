class person{
    private String name;

    String getName(){
        return name;
    }

    void setName(String name){
         this.name = name;
    }


}


public class Encapsulation {
    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("Haisdar");
        System.out.println(p1.getName()
        );
    }
}
