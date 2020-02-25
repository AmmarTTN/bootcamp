//Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference
// create and apply multiplication method for the functional interface created.
interface AddCal{
    int add(int a,int b);
}
interface SubCal{
    int sub(int a,int b);
}
interface MulCal{
     int multiply(int a,int b);
}
class ans3 {
    int adder(int a,int b){
        return a+b;
    }
    int suber(int a,int b){
        return a-b;
    }
    static int multiplier(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        MulCal ac=ans3::multiplier;
        int m=ac.multiply(2,3);
        System.out.println("mulplication :"+m);
        AddCal a=new ans3()::adder;
        int x=a.add(2,3);
        System.out.println("Addition:"+x);
        SubCal s=new ans3()::suber;
        int z=s.sub(2,3);
        System.out.println("subtraction:"+z);
    }
}
