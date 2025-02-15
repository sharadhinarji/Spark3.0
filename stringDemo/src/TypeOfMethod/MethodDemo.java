package TypeOfMethod;

public class MethodDemo {
    public static void main(String[] args) {
        print();
        int s=samosa();
        System.out.println("samosa"+s);
        display("raj");
        display("ram",21);
        int sum = sum(10, 30);
        System.out.println("sum of numbers"+sum);
    }
//    method with no return type and no para
    public  static  void print(){
        System.out.println("hello world");
    }
//    method with return and no para
    public static int samosa(){
        return 2;
    }
//    method with no return and with para
    public  static void display(String name) //para
    {
        System.out.println("name of student"+name);
    }
   // method with no return and with para
    public  static void display(String name,int age) //para
    {
        System.out.println("name of student"+name);
        System.out.println("age of student"+age);
    }
    //method with return type and with para
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }

}
