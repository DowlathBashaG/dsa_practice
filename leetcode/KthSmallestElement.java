package dowlath.io.dsa.leetcode;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] n = {7,10,4,3,20,15};
        int k = 3;
        System.out.println("Kth Smallest Element .... : "+ kthSmallestElement(n,k));
    }
    private static int kthSmallestElement(int[] n, int k){
        Arrays.sort(n);
        int ans = 0;
        for(int i=0;i<n.length;i++){
            if(k==i+1){
                ans = n[i];
            }
        }
        return ans;
    }
}
