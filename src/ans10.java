//Q10.Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  C) multiplying 2 float
//  D) multiplying 2 int
//  E) concate 2 string
//  F) Concate 3 String
public class ans10 {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    float multiply(float a,float b){
        return a*b;
    }
    int multiply(int a,int b){
        return a*b;
    }
    String concate(String s1,String s2){
        return s1+s2;
    }
    String concate(String s1,String s2,String s3){
        return s1+s2+s3;
    }
}
class main{
    public static void main(String[] args) {
        ans10 x=new ans10();
        System.out.println(x.add(2,3));
        System.out.println(x.add(10.0,20.0));
        System.out.println(x.multiply(5,5));
        System.out.println(x.multiply(0.5f,0.5f));
        System.out.println(x.concate("Hello","World"));
        System.out.println(x.concate("Hello","World","Second"));
    }
        }