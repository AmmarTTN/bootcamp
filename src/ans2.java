//Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class ans2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        String words[]=str.split(" ");
        int count=1;
        System.out.println("no of occurance of duplicates words");
        HashMap<String,Integer> h=new HashMap<String, Integer>();
        for (int i = 0; i <words.length ; i++) {
            if(h.containsKey(words[i])){
                h.put(words[i],h.get(words[i])+1);
            }else {
                h.put(words[i],1 );
            }
        }
        h.forEach((k,v)->{
            if(v>1){
                System.out.println(k+" "+v);
            }
        });

       /* for (int i = 0; i <words.length ; i++) {
            for (int j=i+1; j <words.length ; j++) {
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="-1";
                }

            }
            if(count>1 && words[i]!="-1"){
                System.out.println(words[i]+" "+count);
            }
            count=1;
        }*/

    }
}
