//quo4. create singleton class.
public class ans4 {
    private static ans4 object=null;
    public String s;
    private ans4(){
        s=" object 1";
    }
    public static ans4 getObject(){
        if(object==null){
            object=new ans4();
        }
        return object;
    }
}
class main{
    public static void main(String[] args) {
        ans4 a= ans4.getObject();
        System.out.println(a.s);
        a.s="object 2....changes in 'a' reflecting in 'b'";
        ans4 b=ans4.getObject();
        System.out.println(b.s);
    }
}
