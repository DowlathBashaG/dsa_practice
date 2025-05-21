package dowlath.io.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringMaxLength {
    public static void main(String[] args) {
       String input = "abcabcdbb";
       int MaxLength = getLongestSubString(input);
       System.out.println("The LongestSubString ... : "+ MaxLength);
    }
    static int getLongestSubString(String s){
        Map<Character,Integer> seen = new HashMap<>();
        int maxLen = 0;
        int start = 0;

        for(int end = 0; end < s.length(); end++){
            char current = s.charAt(end);

            if(seen.containsKey(current) && seen.get(current) >= start) {
                start = seen.get(current) + 1;
            }

            seen.put(current,end);
            maxLen = Math.max(maxLen,end-start+1);

        }
        return maxLen;
    }
}
