//Q8.  Implement multiple inheritance with default method inside  interface.
interface demo1{
    default void disc(){
        System.out.println("disc");
    }

    default void print(){
        System.out.println(" demo1 print");
    }
}

interface demo2{
    default void roll(){
        System.out.println("roll");
    }

    default void print(){
        System.out.println("demo2 print");
    }
}
class MainDemo implements demo1, demo2 {

    public void print(){
        demo1.super.print();
        demo2.super.print();
    }

    public static void main(String[] args) {
        MainDemo m = new MainDemo();
        m.disc();
        m.roll();
        m.print();
    }
}
