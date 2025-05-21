package dowlath.io.dsa.string;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "Dowlath Basha G";
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : s.toCharArray()){
            if(set.add(c)){
                result.append(c);
            }
        }
        System.out.println("Original String.... : "+ s);
        System.out.println("After removed duplicates  String.... : "+ result.toString());
    }
}
