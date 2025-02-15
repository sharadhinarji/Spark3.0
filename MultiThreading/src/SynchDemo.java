class mythread4 extends Thread{
    @Override
    public void run() {
        int arr[]={1,2,3,4,5};
        int sum=0;
        for (int i=0;i<5;i++){
            sum=sum+arr[i];
            System.out.println(sum+Thread.currentThread().getName());
        }
    }
}


public class SynchDemo {
    public static void main(String[] args) {
        mythread4 m4=new mythread4();
        Thread t=new Thread(m4);
        t.start();
        for (int i=0;i<5;i++){
        System.out.println(Thread.currentThread().getName()+""+i);

    }}

}
