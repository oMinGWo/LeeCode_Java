package question;

public class No055 {
    public boolean canJump(int[] nums) {
        int max=nums[0];
        for (int i=1;i<nums.length && max>=i;++i){
            if (i+nums[i]>max){
                max=i+nums[i];
            }
        }
        return max >= nums.length - 1;
    }
}
