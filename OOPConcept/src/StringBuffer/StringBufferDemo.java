package StringBuffer;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("abbbs");
        System.out.println(sb);
        StringBuffer newobj = sb.append("dsgsh");
        System.out.println(newobj);
        System.out.println(sb.hashCode());
        System.out.println(newobj.hashCode());
        System.out.println(sb);
        System.out.println(newobj);

    }
}
