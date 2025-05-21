package dowlath.io.dsa.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println("The Longest Common Prefix ... : "+ longestCommonPrefix(strs));  // Expected output : fl
    }

    private static String longestCommonPrefix(String[] s) {
        String ans = " ";
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length - 1];
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                ans = ans + first.charAt(i);
            } else {
                break;
            }
        }
        return ans;
    }
}
