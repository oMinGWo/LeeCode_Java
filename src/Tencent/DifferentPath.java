package Tencent;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferentPath {
    ArrayList<Integer> a = new ArrayList<>();
    public static int uniquePaths(int m, int n) {
        if (m==1 || n==1){
            return 1;
        }
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        dp[1][0] = 1;
        dp[0][1] = 1;
        for (int i=0;i<m;++i){
            for (int j=0;j<n;++j){
                if (i-1<0 && j-1<0){
                    continue;
                }else if (i-1<0){
                    dp[i][j] = dp[i][j-1];
                }else if (j-1<0){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
