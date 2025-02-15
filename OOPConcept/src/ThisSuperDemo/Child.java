package ThisSuperDemo;

public class Child  extends parent{
    String name;
    public static void main(String[] args) {

        Child c=new Child();
        c.details();

    }
    public  void details(){
        super.name="parent";
        this.name="child";
        System.out.println(super.name+" "+this.name);
        super.details();//to access the var from parent class

    }
}
