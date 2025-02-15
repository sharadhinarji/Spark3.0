import java.io.File;
import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        try {
            File file=new File("demo.txt");
            Scanner sc=new Scanner(file);//---->FileNotFoundException in compile time to handle exception we use try and catch method
            System.out.println("still calculating....");
        }
        catch (Exception e){
            System.out.println("catch working");

        }
        System.out.println("BBefore compile");
        System.out.println("calculationg---------");
        //System.out.println(10/0);//--->ArthemticException in runtime because it is unchecked
        System.out.println("hello.........");
    }
}
