package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No047 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        help(nums,nums.length,new ArrayList<>(),new boolean[nums.length]);
        return result;
    }

    private void help(int[] nums,int length, List<Integer> curr, boolean[] used){
        if (length==curr.size()){
            if (!contains(curr)){
                result.add(new ArrayList<>(curr));
            }
            return;
        }
        for (int i=0;i<nums.length;++i){
            if (used[i]){
                continue;
            }
            used[i] = true;
            curr.add(nums[i]);
            help(nums,length,curr,used);
            curr.remove(curr.size()-1);
            used[i] = false;
        }
    }

    private boolean contains(List<Integer> list){
        for (List<Integer> rawList: result) {
            if (isSameList(rawList, list)){
                return true;
            }
        }
        return false;
    }

    private boolean isSameList(List<Integer> l1, List<Integer> l2){
        if (l1.size() == l2.size()){
            for (int i=0;i<l1.size();++i){
                if (l1.get(i) != l2.get(i)){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
