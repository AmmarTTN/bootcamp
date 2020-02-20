package ans2;

class runner implements Runnable{
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("child "+i);
        }
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class runnableDemo {
    public static void main(String[] args) {
        Thread t=new Thread(new runner());
        t.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("main "+i);
        }
    }
}
