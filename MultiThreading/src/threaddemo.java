public class  threaddemo{
    public static void main(String[] args) throws InterruptedException {
 ThreadWait t1=new ThreadWait();
 t1.start();
 synchronized (t1){
     System.out.println("main thred calling wait()...");
     t1.wait();//exceute through main
     System.out.println("main thread got notify");
 }
    }
}



 class ThreadWait extends Thread {
    int sum = 0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("child thread start cal....");

            for (int i = 0; i <= 5; i++) {
                sum = sum + i;

            }
            System.out.println("sum is " + sum);
            System.out.println("child thread will notify");
            this.notify();
        }
    }
}
