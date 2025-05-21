package dowlath.io.dsa.leetcode;

public class MergeStringsAltenatively {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println("The alternative string is ... : "+ alterNativeStrings(word1,word2));
    }
    private static String alterNativeStrings(String word1, String word2){
        String ans = "";
        int i = 0 ;

        while(i<word1.length() || i<word2.length()){
            if(i< word1.length()){
                ans = ans+word1.charAt(i);
            }
            if(i<word2.length()){
                ans = ans+word2.charAt(i);
            }
            i++;
        }
        return ans;
    }
}
