package dowlath.io.dsa.leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        //int[] nums = {3,2,2,3}; //output : 2 index elements [2,2,-,-]
        int[] nums = {1,2,3,3,4,4,5};  // output = 5 index elements... [ 1,2,4,4,5,-]
        int removeElement = 3;
        System.out.println("The removed element.... : "+ removeElement(nums,removeElement)); // output : [2,2,-,-]

    }
    private static int removeElement(int[] nums, int removeElement){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != removeElement){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
