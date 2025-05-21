package dowlath.io.dsa.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class addTwoNumber {
    public static void main(String[] args) {
        int target = 9;
        int[] a = {2,11,5,10,7,8};
        int[]result = addTwoNumber(target,a);
        System.out.println(Arrays.toString(result));
    }
    static int[] addTwoNumber(int t,int[] n){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n.length;i++){
            if(!map.containsKey(t - n[i])){
                map.put(n[i],i);
            } else {
                result[1] = i;
                result[0] = map.get(t-n[i]);
                return result;
            }
        }
        throw new IllegalArgumentException("No data found");
    }

}
