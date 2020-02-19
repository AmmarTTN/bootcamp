import java.util.Scanner;

//8. WAP to read words from the keyboard until the word done is entered. For each word except done,
// report whether its first character is equal   to  its last character.
public class ans8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter word:");
        String str=sc.nextLine();
        while(!str.equals("done")){
            if(str.charAt(0)==str.charAt(str.length()-1)){
                System.out.println(str+" has same first and last charater");
            }
         System.out.println("enter word:");
         str=sc.nextLine();
        }
        System.out.println("you entered 'done'");
    }
}
