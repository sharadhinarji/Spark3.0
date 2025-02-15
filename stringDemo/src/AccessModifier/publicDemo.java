package AccessModifier;

public class publicDemo {
     public String name="sharadhi";

    public static void main(String[] args) {
        publicDemo pd=new publicDemo();
        System.out.println(pd.name);

    }
    public void printDemo(){   //when we not use static so we cant access the name but creating object we can access
        System.out.println(name);
    }
}
