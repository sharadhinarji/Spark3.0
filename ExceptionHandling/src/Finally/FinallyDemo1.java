package Finally;

public class FinallyDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
        }
        catch (Exception e){
            System.out.println("catch block");
        }
        finally {
            System.out.println("finally block");//this block will always excute
        }
    }
}
