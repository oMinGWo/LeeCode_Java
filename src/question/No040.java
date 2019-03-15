package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No040 {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        com(candidates,0,new ArrayList<>(),target);
        return result;
    }

    //在深度相同的地方，不允许使用相同元素
    private void com(int[] nums, int start, List<Integer> curr, int target){
        if (target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i=start;i<nums.length;++i){
            if (nums[i] > target){
                return;
            }
            if (i>start && nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            com(nums, i+1, curr, target-nums[i]);
            curr.remove(curr.size()-1);
        }
    }
}
