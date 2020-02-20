// Write a programe do to demonstrate the use of volatile keyword.

import java.util.Scanner;
class processor extends Thread{
    private volatile boolean running=true;
    public void run(){
        while(running){
            System.out.println("hello");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){
        running=false;
    }
}
public class ans1{
    public static void main(String[] args) {
        processor p=new processor();
        p.start();
        Scanner sc=new Scanner(System.in);
        sc.nextLine();

        p.shutdown();
    }
}
