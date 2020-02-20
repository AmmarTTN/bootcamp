import java.util.HashMap;

//Q5. Find common elements between two arrays
public class ans5 {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,7,8,5,6,7,8};
        int b[]=new int[]{5,6,7,8};
        System.out.println("common elements are");
        HashMap<Integer,Boolean> h=new HashMap<Integer, Boolean>();
            for (int i = 0; i <a.length ; i++) {
                    h.put(a[i], false);

            }
            for(int j=0;j<b.length;j++){
                if(h.containsKey(b[j])){
                    h.put(b[j],true);
                }
            }
        for (int i = 0; i <h.size() ; i++) {
                if(h.get(a[i])==true){
                    System.out.println(a[i]);
                }
        }
    }
}
