package dowlath.io.dsa.leetcode;

import java.util.Arrays;

public class MaximumGap {
    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println("Maximum Gap ... : "+ maximumGap(nums));
    }

    private static int maximumGap(int[] a){
        int n = a.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(a);
        int diff = 0;
        int maximumDiff = 0;
        for(int i=0;i<n-1;i++){
            diff = a[i+1] - a[i];
            maximumDiff = Math.max(diff,maximumDiff);
        }
        return maximumDiff;

    }

}
