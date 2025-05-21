package dowlath.io.dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
       // String s = "leetcode";
        String s = "aabb";
        System.out.println(firstUniqueCharacter(s));
    }
    private static int firstUniqueCharacter(String s){
        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i =0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}

