package question;

public class No198 {
	public int rob(int[] nums) {
	    //dp[i]->经历过第i个房子的最大值
        if (nums == null || nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int max = Integer.MIN_VALUE;
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i=2;i<nums.length;++i){
            int s = nums[i] + dp[i-2];
            int notS = dp[i-1];
            dp[i] = Math.max(s,notS);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
