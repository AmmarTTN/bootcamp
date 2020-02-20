//Write a program to demonstrate wait and notify method.
class ans5{
    synchronized void  producer() throws InterruptedException {
        System.out.println("producing");
        wait();
        Thread.sleep(2000);
        System.out.println("resumed production");
    }
    synchronized void consumer() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("consuming");
        notify();
    }
}
class main{
    public static void main(String[] args) throws InterruptedException {
        ans5 a=new ans5();
        Thread t1=new Thread(new Runnable() {
            public void run() {
                try {
                    a.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            public void run() {
                try {
                    a.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
