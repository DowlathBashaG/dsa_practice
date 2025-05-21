package dowlath.io.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort0s1s {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 0, 1, 1, 1, 0, 1, 1, 0);
        List<Integer> sortedList = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println("The Given List ... : "+ integerList);
        System.out.println("The Sorted List ... : "+ sortedList);
        List<Integer> zerosList = sortedList.stream().filter( i->i==0).collect(Collectors.toList());
        List<Integer> onesList = sortedList.stream().filter( i->i==1).collect(Collectors.toList());
        System.out.println("Zeros List ... : "+ zerosList);
        System.out.println("Ones List ... : "+ onesList);
    }
}
