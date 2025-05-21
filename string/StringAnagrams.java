package dowlath.io.dsa.string;

import java.util.Arrays;

public class StringAnagrams {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        boolean isAnagram = areAnagrams(s1,s2);
        System.out.println("Is it Anagrams ... : "+ isAnagram);
    }

    private static boolean areAnagrams(String s1, String s2){
        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();

        if(s1.length() != s2.length()){
            return false;
        }

        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1,char2);
    }
}
