import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

//Write a method that takes a string and returns the number of unique characters in the string.
class ans2 {
    void calculate(String str){
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        char ch[]=str.toCharArray();
        for (char c:ch) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println("Unique characters are: ");
        AtomicInteger count= new AtomicInteger();
        map.forEach((k,v)->{
            if(v == 1){
                count.getAndIncrement();
                System.out.println(k);
            }
        });
        System.out.println("Total " + count + " unique characters");
    }
}
class Main{
    public static void main(String[] args) {
        String str="ammar";
        ans2 a=new ans2();
        a.calculate(str);
    }
}