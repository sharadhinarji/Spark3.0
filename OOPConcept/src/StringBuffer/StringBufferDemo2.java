package StringBuffer;

public class StringBufferDemo2 {
    public static void main(String[] args) {
        String s1="sharadhi";
        String s2=s1.concat("Hebbar");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("-----------------");

        StringBuffer sb1=new StringBuffer("sharadhi");
        StringBuffer sb2=sb1.append("Hebbar");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1==sb2);
        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());
        System.out.println("---------------------");

        StringBuilder stringBuilder=new StringBuilder("sharadhi");
        StringBuilder res = stringBuilder.append("Hebbar");
        System.out.println(res);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder==res);


    }
}
