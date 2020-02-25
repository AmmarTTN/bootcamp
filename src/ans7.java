//Q7.  Override the default method of the interface
interface defaultDemo{
    default void print(){
        System.out.println("default method");
    }
}

class ans7 implements defaultDemo{
     public void  print(){
        System.out.println("overrided default method");
    }
    public static void main(String[] args) {
        ans7 a=new ans7();
        a.print();

    }

}
