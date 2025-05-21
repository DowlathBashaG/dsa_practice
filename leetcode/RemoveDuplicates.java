package dowlath.io.dsa.leetcode;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a= {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Remove duplicates .... : " + removeDuplicates(a));
    }

    private static int removeDuplicates(int[] a){
        int lastUniqueIndex = 0;
        for(int i = 1; i<a.length;i++){
           if(a[lastUniqueIndex] != a[i]){
               a[lastUniqueIndex+1] = a[i];
               lastUniqueIndex++;
           }

        }
        return lastUniqueIndex+1;

    }

}
