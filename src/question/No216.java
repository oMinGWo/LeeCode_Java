package question;

import java.util.ArrayList;
import java.util.List;

public class No216 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        help(nums,k,0,n,new ArrayList<>());
        return result;
    }

    private void help(int[] nums, int depth, int start, int target, List<Integer> curr){
        if (depth==curr.size() && target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i=start;i<nums.length;++i){
            if (nums[i]>target){
                break;
            }
            curr.add(nums[i]);
            help(nums,depth,i+1,target-nums[i],curr);
            curr.remove(curr.size()-1);
        }
    }
}
