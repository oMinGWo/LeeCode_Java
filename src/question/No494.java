package question;

import java.util.Arrays;

public class No494 {
    /*
    You are given a list of non-negative integers, a1, a2, ..., an, and a target, S. Now you have 2 symbols + and -. For each integer, you should choose one from + and - as its new symbol.
    Find out how many ways to assign symbols to make sum of integers equal to target S.
     */
    //644ms
    public int findTargetSumWays(int[] nums, int S) {
        return findTargetSumWays(nums, 0, 0, S);
    }
    private int findTargetSumWays(int[] nums, int index, int sum, int S){
        if (index == nums.length) {
            if (S == 0) return 1;
            else return 0;
        }
        int x = findTargetSumWays(nums, index+1, sum + nums[index], S - nums[index]);
        int y = findTargetSumWays(nums, index+1, sum - nums[index], S + nums[index]);
        return x + y;
    }
}
