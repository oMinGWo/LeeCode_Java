package question;

public class No746 {
    public int minCostClimbingStairs(int[] cost) {
        //之前这里不太懂，为啥返回值是最后两个值的最小值
        //道理很简单，就是要走到最后，有两种走法，从倒数第一个台阶，走一步，or，从倒数第二个台阶走两步
        //所以就是这两个数字的最小值喽
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i=2;i<cost.length;++i){
            int select = cost[i] + Math.min(dp[i-1], dp[i-2]);
            int notSelect = dp[i-1] + cost[i];
            dp[i] = Math.min(select, notSelect);
        }
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }
}
