package dowlath.io.dsa.leetcode;

import java.util.Arrays;

public class MoveZeroEnd {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZerosEnd(nums);
        System.out.println("Zeros are Moved to End .... : " + Arrays.toString(nums));
    }
    private static void moveZerosEnd(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0 && nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[j] != 0){
                j++;
            }
        }
    }
}
