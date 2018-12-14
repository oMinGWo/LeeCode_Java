package question;

public class No115 {
    //https://blog.csdn.net/qq508618087/article/details/50108715
    //尝试用DP做一下。。
    public int numDistinct2(String s, String t) {
        int r = t.length();
        int c = s.length();
        int[][] DP = new int[r+1][c+1];
        for (int i=0;i<c+1;++i){
            DP[0][i] = 1;
        }
        for (int i=1;i<=r;++i){
            for (int j=1;j<=c;++j){
                if (t.charAt(i-1) == s.charAt(j-1)) {
                    DP[i][j] = DP[i][j-1] + DP[i-1][j-1];
                }else{
                    DP[i][j] = DP[i][j-1];
                }
            }
        }
        return DP[r][c];
    }

    //TODO: A了52个，剩下的超时了，查了下用DP做，还不太明白中。。
    int result = 0;
    public int numDistinct(String s, String t) {
        help(s,t);
        return result;
    }
    private void help(String remainS, String remainT){
        if (remainT.length() == 0 || remainS.equals(remainT)) {
            result++;
            return;
        }
        if (remainS.length() == 0) {
            return;
        }
        if (remainS.charAt(0) == remainT.charAt(0)){
            help(remainS.substring(1), remainT.substring(1));
        }
        help(remainS.substring(1), remainT);
    }
}
