package dowlath.io.dsa.string;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse_Sentence {
    public static void main(String[] args) {
        String s = "This is my city;";
        String reversed = Arrays.stream(s.split(" "))
                          .map(Reverse_Sentence::reverseWord)
                          .collect(Collectors.joining(" "));
        System.out.println("Given word ... : "+ s);
        System.out.println("Reverse word ... : "+ reversed);
    }
    private static String reverseWord(String word){
        char[] chars = word.toCharArray();
        int left = 0, right = chars.length-1;
        while(left<right){
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }
}
