class myrun implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            System.out.println("child thread  "+i);
        }

    }
}



public class RunningDemo {
    public static void main(String[] args) {
        myrun r=new myrun();
        Thread t=new Thread(r);
        t.start();

        for (int a=0;a<=6;a++){
            System.out.println("sharu "+a);
        }
    }
}
