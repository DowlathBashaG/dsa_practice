package dowlath.io.dsa.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDictonary = Arrays.asList("leet","code");
        System.out.println("WordBreak .... : "+ wordBreak(s,wordDictonary));
    }
    private static boolean wordBreak(String s, List<String> wordDict){
        Set<String> set = new HashSet<>(wordDict);
        boolean dp[] = new boolean[s.length()+1];
        dp[0] = true;

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
     }

}
