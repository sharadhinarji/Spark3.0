class mythread1 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+""+i);
            Thread.yield();
        }
    }
}





public class YieldDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new mythread1();
        t.start();

        for (int i=0;i<5;i++){
            System.out.println("main thread");
        }

    }
}
