//Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails
// which provide there specific details like rateofinterest etc,print details of every banks
public class ans11 {
    public static void main(String[] args) {
        boi b=new boi();
        System.out.println("details of BOI :-");
        b.getDetails();
        icici i=new icici();
        System.out.println("details of ICICI :-");
        i.getDetails();
        sbi s=new sbi();
        System.out.println("details of SBI :-");
        s.getDetails();
    }
}
class boi{
    float rateofinterest=5.0f;
    int accounts=1000;
    int branches=20;
    void getDetails(){
        System.out.println("No. of accounts: "+" "+accounts);
        System.out.println("Rate of interset: "+" "+rateofinterest);
        System.out.println("branches: "+" "+branches);
    }
}
class icici{
    float rateofinterest=4.2f;
    int accounts=1050;
    int branches=25;
    void getDetails(){
        System.out.println("No. of accounts: "+" "+accounts);
        System.out.println("Rate of interset: "+" "+rateofinterest);
        System.out.println("branches: "+" "+branches);
    }
}
class sbi{
    float rateofinterest=5.0f;
    int accounts=1000;
    int branches=20;
    void getDetails(){
        System.out.println("No. of accounts: "+" "+accounts);
        System.out.println("Rate of interset: "+" "+rateofinterest);
        System.out.println("branches: "+" "+branches);
    }
}