package TypeOfObj;

public class InstanceDemo {
//    here we define variable in below class and outside the method and then for acces the variable we use object
    String name="sita";
    public static void main(String[] args) {
        InstanceDemo id=new InstanceDemo();
        System.out.println(id.name);
        System.out.println(id.hashCode());
        InstanceDemo id1=new InstanceDemo(); //we create no of object
        System.out.println(id1.name);
        System.out.println(id1.hashCode());
        id.name="ram";
        System.out.println(id.name);
        System.out.println(id.hashCode());
        System.out.println(id1.name);
        System.out.println(id1.hashCode());


    }
}
