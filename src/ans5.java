//Q5. Find common elements between two arrays
public class ans5 {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,7,8,5,6,7,8};
        int b[]=new int[]{5,6,7,8};
        System.out.println("common elements are");
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                if(a[i]==b[j] && b[j]!=-1){
                    System.out.print(a[i]+" ");
                    b[j]=-1;
                }

            }

        }
    }
}
