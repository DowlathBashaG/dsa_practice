package dowlath.io.dsa.leetcode;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
       // String s1 = "anagram";
       // String s2 = "nagaram";
        String s3 = "cat";
        String s4 = "rat";
        //System.out.println("Is valid anagram ... : "+ isAnagram(s1,s2));
        System.out.println("Is valid anagram ... : "+ isAnagram(s3,s4));
    }

    private static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<c1.length;i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }

}
