package dowlath.io.dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = spiralOrder(input);  // expected : [1,2,3,6,9,9,7,4,5]
        System.out.println(result);

    }
    private static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        int cls = 0;
        int rs = 0;
        int re = matrix.length-1;
        int cle = matrix[0].length-1;

        while(cls <= cle && rs <= re){
        // < ---------------- left to right  ----------------- >
        // 1st row...here row is fixed and column value is changing.so here rs ..row and i is column.

        for(int i=cls; i<cle;i++){
            ans.add(matrix[rs][i]);
        }
        rs++;   // row value increase

        // < ---------------- top to bottom -------------------->
        for(int i = rs;i<=re;i++){
            ans.add(matrix[i][cle]);
        }
        cle--;

        // <-----------------right to left ---------------------?

        if(rs<=re) {
            for (int i = cle; i >= cls; i--) {
                ans.add(matrix[re][i]);
            }
            re--;
        }

        //<-----------------bottom to top ---------------------->

        if(cls<=cle){
            for(int i=re;i>=rs;i--){
                ans.add(matrix[i][cls]);
            }
            cls++;
         }
        }
        return ans;
    }
}
