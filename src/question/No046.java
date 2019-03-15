package question;

import java.util.ArrayList;
import java.util.List;

public class No046 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        help(nums, new boolean[nums.length],nums.length,new ArrayList<>());
        return result;
    }

    private void help(int[] nums, boolean[] used, int length, List<Integer> curr){
        if (length==curr.size()){
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i=0;i<nums.length;++i){
            if (used[i]){
                continue;
            }
            used[i] = true;
            curr.add(nums[i]);
            help(nums, used, length, curr);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }
}
