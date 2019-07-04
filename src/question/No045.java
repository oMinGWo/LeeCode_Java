package question;

public class No045 {
    //超时，92过了91个
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;
        for (int i=1;i<nums.length;++i){
            int minStep = Integer.MAX_VALUE;
            for (int j=i-1;j>=0;--j){
                if (nums[j] + j >= i){
                    minStep = Math.min(minStep, dp[j] + 1);
                }
            }
            dp[i] = minStep;
        }
        return dp[dp.length-1];
    }
}
