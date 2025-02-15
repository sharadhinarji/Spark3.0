public class MTProjectDemo {
    public static void main(String[] args) {
        Thread t1=new Thread(new myrun());
        System.out.println("main thread name ="+Thread.currentThread());
        String t1name=t1.getName();
        System.out.println("default name "+t1name);

        t1.setName("MY-Thread-t1");
        System.out.println("name "+t1);
    }
}
