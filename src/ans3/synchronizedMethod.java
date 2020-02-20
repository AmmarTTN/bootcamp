//Write a program using synchronization method.
package ans3;
class synchronizedMethod implements Runnable{
    public void run(){
        this.print();
        }
        synchronized void print(){
            for(int i=0;i<100;i++) {
                System.out.println(i + "  " + Thread.currentThread().getName());
            }
    }
}
class main{
    public static void main(String[] args) {
        synchronizedMethod s=new synchronizedMethod();
        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
        t1.start();
        t2.start();
    }
}
