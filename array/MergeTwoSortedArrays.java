package dowlath.io.dsa.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] merged = twoSortedArray(arr1,arr2);
        System.out.println(Arrays.toString(merged));
    }

    private static int[] twoSortedArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n+m];
        int i=0,j=0,k=0;
        while( i<n && j<m){
            if(arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            } else{
                result[k++] = arr2[j++];
            }
        }
        while(i<n) result[k++] = arr1[i++];
        while(j<m) result[k++] = arr2[j++];
        return result;
    }
}
