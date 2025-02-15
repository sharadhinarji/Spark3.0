package TypeOfObj;

public class StaticDemo {
   static String name="sita";//here do not copy the variable instead when we change the value it continue
    public static void main(String[] args) {
//        StaticDemo sd=new StaticDemo(); ---->no need to create object in static instead use class name
        System.out.println(StaticDemo.name);
        StaticDemo.name="ram";
        System.out.println(StaticDemo.name);
//        StaticDemo sd1=new StaticDemo();
        System.out.println(StaticDemo.name);

    }
}
