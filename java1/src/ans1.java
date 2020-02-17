//Q1. Write a program to replace a substring inside a string with other string ?
import java.util.Scanner;
public class ans1 {
    public static void main(String[] args) {

        String str;
        System.out.println("enter main string");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        System.out.println("enter substring to be replaced");
        String rep=sc.nextLine();
        System.out.println("enter replacing string");
        String txt=sc.nextLine();
        str=str.replace(rep,txt);
        System.out.println("new string");
        System.out.println(str);
    }
}
