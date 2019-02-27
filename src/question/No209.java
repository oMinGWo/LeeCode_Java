package question;

public class No209 {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums==null || nums.length==0){
            return 0;
        }
        if (nums.length==1){
            if (nums[0] >= s) {
                return 1;
            } else {
                return 0;
            }
        }
        int left=0;
        int right=0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(left < nums.length && right < nums.length){
            while (sum < s && right < nums.length){
                sum += nums[right];
                right++;
            }
            while(sum >= s && left < nums.length){
                sum -= nums[left];
                left++;
                min = Math.min(min, right-left+1);
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
