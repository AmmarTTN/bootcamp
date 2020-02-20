package ans2;

class Runner extends Thread{
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
public class threadClassDemo {
    public static void main(String[] args) {
        Runner r=new Runner();
        r.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("main "+i);
        }
    }
}
