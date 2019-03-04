package question;

public class No053 {
    public int maxSubArray(int[] nums) {
        /*
        如果前面的和sum小于0，则最大的肯定是从现在的这个开始的，前面的都不要了
        如果前面的和大于0，则和加上现在的数字，和max比一下
        */
        if (nums==null || nums.length==0){
            return 0;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;++i){
            if (sum < 0){
                sum = nums[i];
            }else {
                sum += nums[i];
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}
