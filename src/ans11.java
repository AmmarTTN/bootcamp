import java.util.Arrays;
import java.util.OptionalDouble;

//Q11 Find average of the number inside integer list after doubling it.
class ans11 {
    public static void main(String[] args) {
        OptionalDouble avg=Arrays.asList(100,100,100).stream().map(e->e*2).mapToInt(e->e).average();
        System.out.println("average: "+avg.getAsDouble());
    }
}
