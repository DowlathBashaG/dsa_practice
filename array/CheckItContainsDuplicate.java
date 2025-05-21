package dowlath.io.dsa.array;

import java.util.HashSet;
import java.util.Set;

public class CheckItContainsDuplicate {
    public static void main(String[] args) {
        int[] a = {1,2,3,3};  // true , {1,2,3,4} -> false
        System.out.println("Is it contains duplicate : " + solution(a));
    }
    private static boolean solution(int[] a){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(set.contains(a[i])){
                return true;
            }
            set.add(a[i]);
        }
        return false;
    }
}
