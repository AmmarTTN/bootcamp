//Q3. Write a program to find the number of occurrences of a character in a string without using loop?
import java.util.Scanner;
public class ans3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        System.out.println(" enter character");
        String c=sc.nextLine();
        int count=str.length()- str.replace(c,"").length();
        System.out.println("occurance"+" "+count);
    }
}
