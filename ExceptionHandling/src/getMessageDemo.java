public class getMessageDemo {
    public static void main(String[] args) {
        m1();

    }
    public  static void  m1(){
        try {
            m2();
        }
        catch (Exception e){
            e.getMessage();  //---->default it cant give msg
        }

    }
    public  static void  m2(){
        m3();

    }
    public  static void  m3(){
        m4();

    }
    public  static void  m4(){
      // throw new ArithmeticException("exception");
        //System.out.println(10/0);

    }
}
