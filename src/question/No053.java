package question;

public class No053 {
    //TODO:不会呀呀呀呀
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for (int i=0;i<nums.length;++i){
            sum+=nums[i];
            if (sum > max){
                max = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
