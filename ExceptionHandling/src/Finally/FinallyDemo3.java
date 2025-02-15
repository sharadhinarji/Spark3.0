package Finally;

public class FinallyDemo3 {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            return; //finally >return so finally will always exceute
        }
        catch (Exception e){
            System.out.println("catch block");
        }
        finally {
            System.out.println("finally block");//this block will always excute
        }
    }
}
