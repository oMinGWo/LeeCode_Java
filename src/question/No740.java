package question;

public class No740 {
    public int deleteAndEarn(int[] nums) {
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
        int[] count=new int[max-min+1];
        for (int i=0;i<nums.length;++i){
            int num=nums[i];
            count[num-min] = count[num-min] + 1;
        }
        int[] dp=new int[max-min+1];
        dp[0] = count[0] * min;
        for (int i=1;i<count.length;++i){
            int c=count[i];
            int num=i+min;
            dp[i] = Math.max(c*num, dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
