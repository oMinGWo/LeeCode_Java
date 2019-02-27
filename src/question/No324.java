package question;

import java.util.Arrays;

public class No324 {
    //TODO
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        for (int i=0;i<nums.length/2;++i){
            res[i * 2] = nums[i];
            res[i * 2 + 1] = nums[nums.length-i-1];
        }
        System.arraycopy(res, 0, nums, 0, nums.length);
    }
}
