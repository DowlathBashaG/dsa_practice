package dowlath.io.dsa.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStream_UsingIntStream {
    public static void main(String[] args) {
        String originalString  = "Dowlath Basha G";
        String reversedString = IntStream.rangeClosed(1, originalString.length())
                .mapToObj(i-> originalString.charAt(originalString.length()-i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Original String : "+ originalString);
        System.out.println("Reversed String : "+ reversedString);
    }
}
