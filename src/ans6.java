import java.util.HashMap;
import java.util.Map;
//Q6. There is an array with every element repeated twice except one. Find that element
public class ans6 {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,2,3,1,3,4,5,4};// 5 occurred once only
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for (int i:a) {
           if(h.containsKey(i)){
                h.put(i,h.get(i)+1);
           }else{
               h.put(i,1);
           }
        }
        for(Map.Entry entry :h.entrySet()){
            if(entry.getValue().equals(1)){
                System.out.println(entry.getKey()+" "+"occurred once only");
            }
        }

    }
}
