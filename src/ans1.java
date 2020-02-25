//Write the following a functional interface and implement it using lambda:
//(1) First number is greater than second number or not         Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
//(3) Concatination of 2 string                                 Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return .                Parameter (String) Return (String)
interface Greater{
     boolean calculate(int i1 ,int i2);
}
interface incrementer{
    int calculate(int n);
}
interface concate{
    String con(String s1,String s2);
}
interface Upper{
    String capital(String s);
}
public class ans1 {
    public static void main(String[] args) {
        Greater g=(i1,i2)->{           // (1)
            return i1 > i2;
        };
        boolean b=g.calculate(6,3);
        System.out.println(b);


        incrementer i=(n)->{           // (2)
          return n+1;
        };
        int l=i.calculate(5);
        System.out.println(l);


        concate c=(s1,s2)->{            //(3)
          return s1+s2;
        };
        String s=c.con("hello","WORLD");
        System.out.println(s);


        Upper u=(s1)->{                 //(4)
            return s1.toUpperCase();
        };
        String s1=u.capital("ttn");
        System.out.println(s1);
    }
}
