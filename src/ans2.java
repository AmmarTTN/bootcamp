// Q2 Create a functional interface whose method takes 2 integers and return one integer.
interface add{
    int add(int a,int b);
}
public class ans2 {
    public static void main(String[] args) {
        add a=(n1,n2)->{
          return n1+n2;
        };
        int n=a.add(2,3);
        System.out.println(n);
    }
}
