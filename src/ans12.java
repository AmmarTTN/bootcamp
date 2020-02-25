import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

//Q12. Find the first even number in the integer list which is greater than 3
class ans12 {
    public static void main(String[] args) {
        OptionalInt o =Arrays.asList(1,2,3,5,6,8,4).stream().filter(e->e>3 && e%2==0).mapToInt(e->e).findFirst();
        System.out.println(o.getAsInt());
    }
}
