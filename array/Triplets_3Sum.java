package dowlath.io.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets_3Sum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4}; // Expected output : [[-1,-1,2],[-1,0,1]]
        List<List<Integer>> result = solution(nums);
        System.out.println(result);

    }

    private static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> array = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int L = i + 1;
                int R = nums.length - 1;
                int T = -nums[i];
                while (L < R) {
                    if (T == nums[L] + nums[R]) {
                        array.add(Arrays.asList(nums[i], nums[L], nums[R]));
                        while (L < R && nums[L] == nums[L + 1]) L++;
                        while (L < R && nums[R] == nums[R - 1]) R--;
                        L++;
                        R--;
                    } else if (nums[L] + nums[R] < T) {
                        L++;
                    } else {
                        R--;
                    }
                }
            }
        }
        return array;
    }
}
