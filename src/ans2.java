//2. WAP to sorting string without using string Methods?
public class ans2 {
    public static void main(String[] args) {
        String str="edcba";
        System.out.println("unsorted"+" "+str);
        char temp;
        char ch[]=str.toCharArray();
        for (int i = 0; i <ch.length-1 ; i++) {
            for(int j=0;j<ch.length-1-i;j++){
                if(ch[j]>ch[j+1]){
                  temp= ch[j];
                  ch[j]=ch[j+1];
                  ch[j+1]=temp;
                }
            }
        }
        str=String.valueOf(ch);
        System.out.println("sorted "+" "+str);
    }
}
