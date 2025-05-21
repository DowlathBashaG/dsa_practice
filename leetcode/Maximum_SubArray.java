package dowlath.io.dsa.leetcode;

public class Maximum_SubArray {
    public static void main(String[] args) {
        // output 6 , Explanation : The subarray [4,-1,2,1] has target sum 6.
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int maximum_subarray = maximum_subarray(nums);
        System.out.println("The maximum_subarray ... : "+ maximum_subarray);
    }

    private static int maximum_subarray(int[] n){
        if(n.length == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n.length;i++){
            sum=sum+n[i];
            max = Math.max(sum,max);

            if(sum<0){
                sum=0;
            }
        }
        return max;
    }

}
