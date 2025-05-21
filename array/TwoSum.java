package dowlath.io.dsa.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {0,9,5,4,1};
        int target = 11;
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
    private static int[] twoSum(int[] nums,int target){
        int[] result = new int[2];
        Map<Integer,Integer> hMap = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            if(!hMap.containsKey(target-nums[i])){
                hMap.put(nums[i],i);
            } else {
                result[1] = i;
                result[0] = hMap.get(target-nums[i]);
                return result;
            }
        }
        throw new IllegalArgumentException("No data found");
       // return null;
    }
}