//Write a program using synchronization block.
package ans3;

class synchronizedBlock implements Runnable{
    public void run() {
        synchronized (this) {
            for(int i=0;i<10;i++){
                System.out.println(i+"  "+Thread.currentThread().getName());
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        synchronizedBlock s=new synchronizedBlock();
        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
        t1.start();
        t2.start();
    }
}
