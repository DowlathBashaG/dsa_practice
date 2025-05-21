package dowlath.io.dsa.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetFrequencies {
    public static void main(String[] args) {
        String s = "Dowlath Basha G";

        Map<Character,Integer> countMap = new LinkedHashMap<>();

        for(char c : s.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : countMap.entrySet()){
            System.out.println(entry.getKey() + "    :    "+ entry.getValue());
        }


    }
}
