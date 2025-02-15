package Finally;

public class FinallyDemo4 {
    public static void main(String[] args) {
        int i = m1();
        System.out.println(i);

    }
    public static int m1(){
        try {
            System.out.println("try block");
            return 5;
        }
        catch (Exception e){
            System.out.println("catch block");
            return 4;

        }
        finally {
            System.out.println("finally block");//this block will always excute and greater than return final block ka return excute hoga
            return 2;
        }
    }
}
