package dowlath.io.dsa.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int sum = 9;
        int[] result = twoSum(a,sum);
        System.out.println(Arrays.toString(result));
    }
    private static int[] twoSum(int[] a, int t){
        int[] result = new int[2];
        Map<Integer,Integer> hMap = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!hMap.containsKey(t-a[i])){
                hMap.put(a[i],i);
            } else {
                result[1] = i;
                result[0] = hMap.get(t-a[i]);
                return result;
            }
        }
     throw new IllegalArgumentException("No data found");
    }
}
