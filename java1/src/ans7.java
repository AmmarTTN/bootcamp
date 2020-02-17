//Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively.
public class ans7 {
    static int age;
    static String firstname;
    static String lastname;
    static{
        firstname="Ammar";
        lastname="Alam";
        age=22;
    }
    public static void print(){
        System.out.println("First name:"+" "+firstname);
        System.out.println("Last name:"+" "+lastname);
        System.out.println("Age:"+" "+age);
    }
    public static void main(String[] args) {
        print();
    }
}
