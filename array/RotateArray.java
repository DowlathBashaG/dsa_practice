package dowlath.io.dsa.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};   // output : [5,6,7,1,2,3,4]
        int k = 3;
        System.out.println("Before rotateArray ... : "+ Arrays.toString(nums));
        //rotateArray(nums,k);
        int[] result = solution(nums,k);
        System.out.println("After rotateArray ... : "+ Arrays.toString(nums));
        System.out.println("After rotateArray ... using (i+k) %  size of array  - using this formula : "+ Arrays.toString(result));
    }

    private static int[] solution(int[] nums, int k) {
        int[] result = new int[nums.length];
        for(int i=0;i< nums.length;i++){
            result[(i+k)% nums.length]  = nums[i];
        }
        return result;
    }

    private static void rotateArray(int[] nums, int k){
        // Entire array reversed
        rotate(nums,0,nums.length-1);
        // First Kth element reversed
        rotate(nums,0,k-1);
        // After kth element reversed
        rotate(nums,k,nums.length-1);
    }
    private static void rotate(int[] nums,int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
