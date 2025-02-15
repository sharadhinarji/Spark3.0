import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class throwDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        m1();

    }
    public  static void  m1() throws FileNotFoundException {
        m2();

    }
    public  static void  m2() throws FileNotFoundException {
        m3();

    }
    public  static void  m3() throws FileNotFoundException {
        m4();

    }
    public  static void  m4() throws FileNotFoundException {
        File file=new File("demo.txt");
        Scanner sc=new Scanner(file);
    }
}
