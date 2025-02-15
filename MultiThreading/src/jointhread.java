class  myhthread2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
        System.out.println(Thread.currentThread().getName()+""+i+"Ladki pasand..");

            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class jointhread {
    public static void main(String[] args) throws InterruptedException {
        myhthread2 m=new myhthread2();
        Thread t1=new Thread(m);
        t1.start();
        t1.join();
        System.out.println("card print krwa do....");
    }
}
