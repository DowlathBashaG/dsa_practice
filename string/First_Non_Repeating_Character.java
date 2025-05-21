package dowlath.io.dsa.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Non_Repeating_Character {
    public static void main(String[] args) {
        String s = "Dowlath";
        Map<Character,Integer> countMap = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entryMap : countMap.entrySet()){
           if(entryMap.getValue() == 1){
               System.out.println(entryMap.getKey() +" : "+ entryMap.getValue());
               return;
           }
        }
        System.out.println("No non repeating character found");
    }
}
