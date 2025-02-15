package StringMethod;

import java.util.Arrays;

public class StringMethod1 {
    public static void main(String[] args) {
        String s1="ram";
        System.out.println(s1.length());
        String s2="sita";
        char[] arr = s2.toCharArray();
        System.out.println(Arrays.toString(arr));

         String s11="hello";
         String s12="hello";
         //String s01="raj";
        System.out.println(s11.equals(s12));//content compare-->scp
        System.out.println(s11==s12);//address
        System.out.println("------------------------");
        System.out.println(s11.hashCode());
        System.out.println(s12.hashCode());
       // System.out.println(s01.hashCode());
        System.out.println("-----------------------");

        String s14=new String("hello");
        String s15=new String("hello");
        String s16=new String("raj");
        System.out.println(s14.equals(s15));//content
        System.out.println(s14==s15);//address
        System.out.println(s14.hashCode());
        System.out.println(s15.hashCode());
        System.out.println(s16.hashCode());



    }
}
