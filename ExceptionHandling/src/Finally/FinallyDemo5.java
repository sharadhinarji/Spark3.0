package Finally;

public class FinallyDemo5 {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            System.exit(0);//jvm will stop here so finally will not exceute-
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");//this block will always excute
        }
    }
}
