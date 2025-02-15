package TypeOfObj;

public class LocalDemo {
    public static void main(String[] args) {
//        here we cant access the value of b in main method so usually we create 'object' but in local it is not possible
        int a=10;
//        LocalDemo ld=new LocalDemo();
        System.out.println(a);
    }
    public  static void  local(){
        int b=10;
//       here we cant access the value of a
//        LocalDemo ld=new LocalDemo();
        System.out.println(b);
    }
}
