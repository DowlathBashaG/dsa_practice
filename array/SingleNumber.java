package dowlath.io.dsa.array;

public class SingleNumber {
    public static void main(String[] args) {
        int[] a = {4,1,2,1,2};
        System.out.println("SingleNumber (or) Unique Number ... : "+ singleNumber(a));
    }

    private static int singleNumber(int[] a) {
        int finder = 0;
        for(int i=0;i<a.length;i++){
            finder^=a[i];
        }
        return finder;
    }
}
