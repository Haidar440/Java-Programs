class Modi_1{
    private int id;
    private String name;
    private int salary;
    private String address;
    private String phone;

    public boolean getDetail(){
        System.out.println("Emp_id:"+id);
        System.out.println("Emp_Name:"+name);
        System.out.println("Emp_Salary"+salary);
        System.out.println("Emp_Address"+address);
        System.out.println("Emp_phone:"+phone);

//        return false;
        return false;
    }
    public void setDetail(int id,String name,int salary,String add,String phone){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.phone = phone;

    }
}
public class Get_Set {
    public static void main(String[] args) {
        Modi_1 obj = new Modi_1();
        obj.setDetail(101,"Ali",450505,"Mumbai","45678987");
        System.out.println(obj.getDetail());

    }
}
