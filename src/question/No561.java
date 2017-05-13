package question;

import java.util.Arrays;

public class No561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int re=0;
        for(int i=0;i<nums.length/2;++i){
            re+=nums[2*i];
        }
        return re;
    }
}
