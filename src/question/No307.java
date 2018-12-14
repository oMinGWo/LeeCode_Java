package question;

import java.util.Arrays;

public class No307 {
    //感觉很奇怪的题，
    int[] nums;
    public No307(int[] nums) {
        this.nums = nums;
    }

    public void update(int i, int val) {
        nums[i] = val;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k=i;k<=j;k++){
            sum += nums[k];
        }
        return sum;
    }
}
