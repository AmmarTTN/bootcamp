//Write a method that takes a string and print the number of
// occurrence of each character characters in the string.
import java.util.HashMap;
import java.util.Scanner;
class ans3 {
    void print(String str){
        HashMap<Character,Integer>map=new HashMap<Character, Integer>();
        char ch[]=str.toCharArray();
        for (char c:ch) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else if(c!=' '){
                map.put(c,1);
            }
        }
        map.forEach((k,v)-> System.out.println(k+" occurred "+v+" times"));
    }
}
class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        ans3 a=new ans3();
        a.print(str);
    }
}
