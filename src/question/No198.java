package question;

public class No198 {
	public int rob(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int take = 0;
        int maxProfit = 0; 
        int nonTake = 0; 
        for(int i = 0 ; i < nums.length; ++i){
            take = nonTake + nums[i]; 
            nonTake = maxProfit; 
            maxProfit = Math.max(take,nonTake);
        }
        return maxProfit;
    }
}
