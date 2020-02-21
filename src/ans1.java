//Write Java code to define List . Insert 5 floating point numbers in List,
// and using an iterator, find the sum of the numbers in List.
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ans1 {
    float sum=0;
    float calculate(List list){
        Iterator i=list.iterator();
        while(i.hasNext()){
            sum=sum + (float)i.next();
        }
        return sum;
    }

}
class main{
    public static void main(String[] args) {
        List<Float> list=new LinkedList<Float>();
        list.add(10.1f);
        list.add(20.1f);
        list.add(30.1f);
        list.add(40.1f);
        list.add(50.1f);
        ans1 a=new ans1();
        float sum=a.calculate(list);
        System.out.println("sum= "+sum);
    }
}
