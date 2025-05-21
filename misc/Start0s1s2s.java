package dowlath.io.dsa.misc;

import java.util.Arrays;

public class Start0s1s2s {
    public static void main(String[] args) {
        int[] A = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
        threePartition(A);
        System.out.println(Arrays.toString(A));
    }
    public static void threePartition(int[] A){
        int start = 0, mid = 0, pivot = 1;
        int end = A.length-1;

        while(mid <= end)
        {
            if(A[mid] < pivot){       // current element is 0
                swap(A,start,mid);
                ++start;
                ++mid;
            } else if(A[mid] > pivot) { // current element is 2
                swap(A,mid,end);
                --end;
            }
            else{
                ++mid;    // current element is 1
            }
        }
    }
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
