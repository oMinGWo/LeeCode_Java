package question;

import java.util.ArrayList;
import java.util.List;

public class No078 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        for (int i=0;i<=nums.length;++i) {
            help(nums,i,0,new ArrayList<>());
        }
        return result;
    }

    private void help(int[] nums, int length, int start, List<Integer> curr){
        if (length ==  curr.size()){
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i=start;i<nums.length;++i){
            curr.add(nums[i]);
            help(nums, length, i+1, curr);
            curr.remove(curr.size()-1);
        }
    }
}
