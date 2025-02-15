package Finally;

public class PayementDemo {
    public static void main(String[] args) {
        payment(100);

    }
    public static void payment(int price){
        int bal=200;
        System.out.println("transcation initiating....");
        System.out.println("Select bank-SBI");
        System.out.println("making payment");
        try {
            bal=bal-price;
            System.out.println(10/0);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        finally {
            if(bal>200){
                System.out.println("payment done");
            }

        }
    }
}
