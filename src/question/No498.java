package question;

import java.util.ArrayList;
import java.util.List;

public class No498 {
    //TODO
    public int[] findDiagonalOrder(int[][] matrix) {
        int d = 1;
        int r = 0, c = 0;
        int row_num = matrix.length;
        int col_num = matrix[0].length;
        int[] result = new int[row_num * col_num];
        for (int i=0;i<result.length;++i) {
            result[i] = matrix[r][c];
            r -= d;
            c += d;

        }
        return result;
    }
}
