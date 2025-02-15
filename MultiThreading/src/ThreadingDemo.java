class myThread extends Thread{
    @Override
    public void run() {

        for (int i=0;i<=5;i++){
            System.out.println("child thread  "+i);
        }
    }
}


public class ThreadingDemo {
    public static void main(String[] args) {
        myThread t=new myThread();
        t.start();

        for (int a=0;a<=6;a++){
            System.out.println("sharu "+a);
        }

    }
}
