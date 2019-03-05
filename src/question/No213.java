package question;

public class No213 {
    public int rob(int[] nums) {
        //枚举nums[0]选和不选的情况
        if (nums==null || nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int max = Math.max(nums[0],nums[1]);
        int dp[] = new int[nums.length];

        //nums[0[被选了
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        //注意这里只能到倒数第二个元素
        for (int i=2;i<nums.length-1;++i){
            int s = nums[i] + dp[i-2];
            int notS = dp[i-1];
            dp[i] = Math.max(s,notS);
            max = Math.max(max, dp[i]);
        }

        //nums[0]没被选，则dp[0]等于0
        dp[0] = 0;
        dp[1] = nums[1];
        for (int i=2;i<nums.length;++i){
            int s = nums[i] + dp[i-2];
            int notS = dp[i-1];
            dp[i] = Math.max(s,notS);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
