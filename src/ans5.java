//5. WAP to show object cloning in java using cloneable and copy constructor both.
public class ans5 implements Cloneable{
    int a;
    String s;
    ans5(int a,String s){
        this.a=a;
        this.s=s;
    }

    public static void main(String[] args) {

        try {
            ans5 c1=new ans5(1,"ammar");
            ans5 c2= (ans5)c1.clone();
            System.out.println(c1.a+" "+c1.s);
            System.out.println(c2.a+" "+c2.s);
        }catch(Exception e){
         e.printStackTrace();
        }
    }
}
