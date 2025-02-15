import java.util.Scanner;

public class ExceptionCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value");
        int a=sc.nextInt();
        System.out.println("enter the second value");
        int b=sc.nextInt();
        int add = sum(a,b);
        System.out.println("addition is "+add);
        int res = div(a, b);
        System.out.println("division is  "+res);
    }
    public static int sum(int a,int b){
        return  a+b;
    }
    public static int div(int a,int b){
        //return a/b;//---->it create exception error so handle by try-catch method
        try {
            int res=a/b;
            return res;

        }
        catch (Exception e){
            System.out.println("invalid input");
            return 0;
        }
    }
}
