import java.util.HashMap;
import java.util.Map;
//Q6. There is an array with every element repeated twice except one. Find that element
public class ans6 {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,2,3,1,3,4,5,4};// 5 occurred once only
        int x=a[0];
        for (int i = 1; i <a.length ; i++) {
               x=x^a[i];
        }
        System.out.println(x+" "+"occurred once");
    }
}
