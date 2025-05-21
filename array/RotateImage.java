package dowlath.io.dsa.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = rotateImage(matrix);
        System.out.println(Arrays.deepToString(result)); // Expected o/p : [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
    }
    private static int[][] rotateImage(int[][] matrix) {
     int n = matrix.length;
     for(int i=0;i<n;i++){
         for(int j=i;j<matrix[0].length;j++){
             int temp = matrix[i][j];
             matrix[i][j] = matrix[j][i];
             matrix[j][i] = temp;
         }
     }

     for(int i=0;i<n;i++){
         for(int j=0;j<n/2;j++){
             int temp = matrix[i][j];
             matrix[i][j] = matrix[i][n-1-j];
             matrix[i][n-1-j] = temp;
         }
     }
     return matrix;
    }
}
