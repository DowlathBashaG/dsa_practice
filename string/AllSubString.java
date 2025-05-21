package dowlath.io.dsa.string;

import java.util.stream.IntStream;

public class AllSubString {
    public static void main(String[] args) {
        String s = "abc";
        generateSubString(s);
    }
    private static void generateSubString(String s){
        IntStream.range(0, s.length())
                .forEach(i ->
                        IntStream.rangeClosed(i + 1, s.length())
                                .mapToObj(j -> s.substring(i, j))
                                .forEach(System.out::println)
                );
    }
}
