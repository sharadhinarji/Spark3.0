public class toStringDemo {
    public static void main(String[] args) {
        m1();

    }
    public  static void  m1(){
        try {
            m2();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

    }
    public  static void  m2(){
        m3();

    }
    public  static void  m3(){
        m4();

    }
    public  static void  m4(){
        //throw new ArithmeticException("Exception");
         System.out.println(10/0);

    }
}
