package question;

public class No740 {
    public int deleteAndEarn(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;++i){
            if (nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int[] point = new int[max-min+2];
        for (int i=0;i<nums.length;++i){
            int num = nums[i];
            point[num-1] += num;
        }
        int[] dp = new int[point.length];
        dp[0] = point[0];
        dp[1] = Math.max(point[0], point[1]);
        int re = Integer.MIN_VALUE;
        for (int i=2;i<dp.length;++i){
            int s = point[i] + dp[i-2];
            int notS = dp[i-1];
            dp[i] = Math.max(s,notS);
            re = Math.max(max, dp[i]);
        }
        return re;
    }
}
