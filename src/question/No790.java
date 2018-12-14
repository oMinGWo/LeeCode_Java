package question;

public class No790 {
    //比只有1*2的多米诺骨牌的情况复杂一些
    //需要考虑L型骨牌的多种情况，用DP来做
    //https://www.youtube.com/watch?v=S-fUTfqrdq8
    public int numTilings(int N) {
        //记得大数字要用long型！
        int k = 1000000007;
        long[][] f = new long[N+1][2];
        f[0][0] = 1;
        f[1][0] = 1;
        for (int i=2;i<=N;++i){
            f[i][0] = (f[i-1][0] + f[i-2][0] + f[i-1][1] * 2) % k;
            f[i][1] = (f[i-2][0] + f[i-1][1]) % k;
        }
        return (int)f[N][0];
    }
}
