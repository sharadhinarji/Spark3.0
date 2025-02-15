package OverloadingDemo;

public class OverloadingDemo {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a){
        return a;
    }
}
