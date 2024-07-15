
import java.util.*;
public class RotateMatrix {

    public static int[][] rotate(int[][] matrix) {
        int row = matrix[0].length;
        int col = matrix.length;
        int[][] mat = new int[row][col];
        int i,j;
        for(i=0; i<row; i++) {
            for (j=i; j<col; j++) {
                if(i!=j){
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i] =temp;
                }

            }
        }

        int x= 0;
        int y=col-1;
        System.out.println(matrix);

        for(i=0; i<row; i++) {
            
            while(x<y){
                int temp = matrix[i][x];
                matrix[i][x] = matrix[i][y];
                matrix[i][y] = temp;
                x++;
                y--;
            }
        }

        System.out.println(matrix);

        return matrix;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
        int[][] ans = rotate(matrix);
        int row = matrix[0].length;
        int i,j;
        int col = matrix.length;
        for(i=0; i<row; i++) {
            for (j=0; j<col; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println(rotate(matrix));
    }
}
