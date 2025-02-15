package Finally;

public class FinallyDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("try block");//this print statement is above the exception so it will exceute
            System.out.println(10/0);
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
