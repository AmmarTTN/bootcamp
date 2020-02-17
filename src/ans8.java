//Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
public class ans8 {
    public static void main(String[] args) {
        String str="9876543210";
        System.out.println("Main string: "+" "+str);
        StringBuilder rev= new StringBuilder(str);
        rev=rev.reverse();
        System.out.println("Reversed String:"+" "+rev);
        rev=rev.delete(4,10);
        System.out.println("removed character from 4 to 9"+" "+rev);
    }
}
