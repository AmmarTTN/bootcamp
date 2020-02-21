import java.util.concurrent.CountDownLatch;

//Write a program to demonstrate the use of CountDownLatch.
class Mythread extends Thread{
    CountDownLatch c;
    Mythread(CountDownLatch c){
        this.c=c;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            c.countDown();
            System.out.println(Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
class ans9 {
public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        Mythread t1 = new Mythread(latch);
        Mythread t2 = new Mythread(latch);
        Mythread t3 = new Mythread(latch);
        t1.start();
        t2.start();
        t3.start();
    }
}