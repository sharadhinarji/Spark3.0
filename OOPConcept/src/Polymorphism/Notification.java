package Polymorphism;

public class Notification extends Wish{
    String name="simran";
    public static void main(String[] args) {
        Notification notification=new Notification();
        notification.notifyUser();

    }
    @Override
    public void greet(){
        System.out.println("Ji "+name+" Ji");

    }
    public void notifyUser(){
       greet();
    }
}
