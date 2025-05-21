package dowlath.io.dsa.leetcode;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterSectionTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersection(nums1,nums2); // Expected result = [4,9]
        System.out.println(Arrays.toString(result));

    }
    private static int[] intersection(int[] a, int[] b){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int count = 0;
        for(int i = 0;i<a.length;i++){
            set1.add(a[i]);
        }
        for(int j = 0;j<b.length;j++){
            set2.add(b[j]);
        }

        set1.retainAll(set2);


        int[] ans = new int[set1.size()];

        for(int elements : set1){
            ans[count++] = elements;
        }
        return ans;
    }
}
