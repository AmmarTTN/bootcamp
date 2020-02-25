import java.util.Arrays;

//Q9. Collect all the even numbers from an integer list.
class ans9 {
    public static void main(String[] args) {
        Arrays.asList(2,3,4,5,6,7,8,9).stream().mapToInt(e->e).filter(e->e%2==0).forEach(System.out::println);

    }
}
