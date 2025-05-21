package dowlath.io.dsa.array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        int[] result = moveZeros(a);
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveZeros(int[] a) {
        int L = 0;
        int R = 0;
        if (a.length < 2) {
            return a;
        }
        while (R < a.length) {
            if (a[L] != 0) {
                L++;
                R++;
            } else if (a[R] == 0) {
                R++;
            } else {
                int temp = a[R];
                a[R] = a[L];
                a[L] = temp;
            }
        }
        return a;
    }
}
