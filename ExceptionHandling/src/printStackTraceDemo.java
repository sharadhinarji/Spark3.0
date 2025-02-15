public class printStackTraceDemo {
    public static void main(String[] args) {
        m1();

    }
    public  static void  m1(){
       try {
           m2();
       }
       catch (Exception e){
          e.printStackTrace();
           //System.out.println(e);
       }

    }
    public  static void  m2(){
        m3();

    }
    public  static void  m3(){
        m4();

    }
    public  static void  m4(){
        System.out.println(10/0);

    }
}
