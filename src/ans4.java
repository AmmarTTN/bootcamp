//Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other S
// pecial Characters In A String
import java.util.Scanner;
public class ans4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        float l=str.length();
        char ch[]=str.toCharArray();
        int lower=0,upper=0,digits=0,special=0;
        for (int i = 0; i <ch.length ; i++) {
            if(ch[i]>='a' && ch[i]<='z'){
                lower++;
            }else if(ch[i]>='A' && ch[i]<='Z'){
                upper++;
            }else if(ch[i]>='1' && ch[i]<='9'){
                digits++;
            }else if(ch[i]!=' '){
                special++;
            }
        }
        System.out.println(" number of lower case"+" "+lower+"  percentage"+" "+((lower/l)*100));
        System.out.println(" number of upper case"+" "+upper+"  percentage"+" "+((upper/l)*100));
        System.out.println(" number of digits case"+" "+digits+"  percentage"+" "+((digits/l)*100));
        System.out.println(" number of special case"+" "+special+"  percentage"+" "+((special/l)*100));
    }
}
