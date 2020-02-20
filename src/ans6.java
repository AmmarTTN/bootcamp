//Write a program to demonstrate sleep and join methods.
class ThreadDemo1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}

class ans6{
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo1 td=new ThreadDemo1();
        Thread t=new Thread(td);
        t.start();
        t.join();
        for (int i = 0; i <5 ; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }

}