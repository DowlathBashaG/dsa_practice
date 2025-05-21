package dowlath.io.dsa.string;

import java.util.Arrays;

public class FindShortestWord {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        String shortestWord = Arrays.stream(input.split("\\s+"))
                           .min((a,b) -> Integer.compare(a.length(),b.length())).orElse("");
        System.out.println("The shortest word .... : "+ shortestWord);
    }
}
