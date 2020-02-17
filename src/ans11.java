//Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails
// which provide there specific details like rateofinterest etc,print details of every banks
public class ans11 {
    float rateofinterest;
    int accounts;
    int branches;
    public static void main(String[] args) {
        boi b=new boi(5.0f,1000,20);
        System.out.println("details of BOI :-");
        b.getDetails();
        icici i=new icici(4.2f,1050,25);
        System.out.println("details of ICICI :-");
        i.getDetails();
        sbi s=new sbi(4.8f,2000,30);
        System.out.println("details of SBI :-");
        s.getDetails();
    }
}
class boi extends ans11{
    boi(float f,int acc,int br)

    {
         rateofinterest =f;
         accounts = acc;
         branches = br;
    }
    void getDetails(){
        System.out.println("No. of accounts: "+" "+accounts);
        System.out.println("Rate of interset: "+" "+rateofinterest);
        System.out.println("branches: "+" "+branches);
    }
}
class icici extends ans11{
    icici(float f,int acc,int br)
    {
         rateofinterest =f;
         accounts = acc;
         branches = br;
    }
    void getDetails(){
        System.out.println("No. of accounts: "+" "+accounts);
        System.out.println("Rate of interset: "+" "+rateofinterest);
        System.out.println("branches: "+" "+branches);
    }
}
class sbi extends ans11{
    sbi(float f,int acc,int br)

    {
        rateofinterest =f;
        accounts = acc;
        branches = br;
    }
    void getDetails(){
        System.out.println("No. of accounts: "+" "+accounts);
        System.out.println("Rate of interset: "+" "+rateofinterest);
        System.out.println("branches: "+" "+branches);
    }
}