package dowlath.io.dsa.array;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        // Expected output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = solution(strs);
        System.out.println(result);
    }
    private static List<List<String>> solution(String[] strs){
        Map<String,List<String>> m = new HashMap<>();

        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String s1  = String.valueOf(ch);

            if(!m.containsKey(s1)){
                m.put(s1,new ArrayList<>());
            }
            m.get(s1).add(s);
        }
        return new ArrayList<>(m.values());
    }
}
