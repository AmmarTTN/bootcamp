import java.util.concurrent.Semaphore;

//Q8. Write a program to demonstrate the use of semaphore
class semademo implements Runnable{
    Semaphore sem;
    semademo(Semaphore sem){
        this.sem=sem;
    }
    public void run() {
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" "+"acquired resourse");
        for (int i = 0; i <5 ; i++) {
            System.out.println(--ans8.count);
        }
        System.out.println(Thread.currentThread().getName()+" "+"relaeses resourse");
        sem.release();
    }
}
public class ans8 {
    public static int count=10;
    public static void main(String[] args) throws InterruptedException {
        Semaphore s=new Semaphore(1);
        Thread t1=new Thread(new semademo(s));
        Thread t2=new Thread(new semademo(s));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
