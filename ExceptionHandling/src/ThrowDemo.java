public class ThrowDemo {
    public static void main(String[] args) {
        int div = div(10, 30);
        System.out.println(div);
        int div1 = div(20, 0);
        System.out.println(div1);


    }
    public static int div(int div,int divisor){
        if(divisor==0){
            throw new ArithmeticException("divison by zero");
        }
        return div/divisor;
    }}
