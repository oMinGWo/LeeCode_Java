package question;

import java.util.Arrays;

public class No300 {
    public int lengthOfLIS(int[] nums) {
        int[] f = new int[nums.length];
        for (int i=0;i<f.length;++i){
            f[i] = 1;
        }
        for (int i=0;i<nums.length;++i){
            for (int j=0;j<i;++j) {
                if (nums[j] < nums[i]){
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
        }
        int max = 0;
        for (int i:f){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
}
