import java.util.Scanner;

//7. WAP to convert seconds into days, hours, minutes and seconds.
class calculate {
    int sec;
    calculate(int sec){
    this.sec=sec;
    }
    void cal(){
        if((sec/(24*60*60))>0){
            System.out.println("days:"+(sec/(24*60*60)));
            sec=sec%(24*60*60);
        }
        if((sec/(60*60))>0){
            System.out.println("hours:"+(sec/(60*60)));
            sec=sec%(60*60);
        }
        if((sec/60)>0){
            System.out.println("minutes:"+(sec/(60)));
            sec=sec%(60);
        }
        if(sec>0){
            System.out.println("seconds:"+sec);
        }
    }

}
public class ans7{
    static int s;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter seconds");
        s=sc.nextInt();
        calculate c=new calculate(s);
        c.cal();
    }
}
