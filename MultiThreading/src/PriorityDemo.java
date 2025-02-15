public class PriorityDemo {
    public static void main(String[] args) {
        Thread t1=new Thread(new myrun(),"t1");
        Thread t2=new Thread(new myrun(),"t2");
        Thread t3=new Thread(new myrun(),"t3");

        System.out.println("main thread priority "+Thread.currentThread());
        System.out.println("priority of t1 "+t1.getPriority());

        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);

    }
}
