import java.util.Arrays;

// Q10 Sum all the numbers greater than 5 in the integer list
class ans10 {
    public static void main(String[] args) {
        int sum=0;
        int s=Arrays.asList(1,2,3,6,7,8).stream().filter(e-> e>5).mapToInt(e->e).sum();
        System.out.println(s);
    }
}
