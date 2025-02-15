public class apnaGarage extends car{
    public static void main(String[] args) {
       apnaGarage apnaGarage=new apnaGarage();
       apnaGarage.modification();
    }
    public  void modification(){
        System.out.println("old color is "+color);
        color="red";
        System.out.println("modify color is "+color);
    }
}
