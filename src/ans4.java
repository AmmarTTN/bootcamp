import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Write a program to create a Thread pool of 2 threads where one Thread will print even numbers
// and other will print odd numbers.
class Thread1 implements Runnable{
    public void run(){
        System.out.println("even numbers");
        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
class Thread2 implements Runnable{
    public void run() {
        System.out.println("odd numbers");
        for (int i = 0; i <10 ; i++) {
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
class ans4 {
    public static void main(String[] args) {
        ExecutorService pool= Executors.newFixedThreadPool(2);
        pool.submit(new Thread1());
        pool.submit(new Thread2());
        pool.shutdown();
    }
}
