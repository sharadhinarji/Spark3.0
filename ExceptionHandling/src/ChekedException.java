import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChekedException {
    public static void main(String[] args) {

        try {
            File file=new File("demo.txt");
            Scanner sc=new Scanner(file);
        }
        catch (FileNotFoundException e){
            System.out.println("catch working");
        }
    }
}
