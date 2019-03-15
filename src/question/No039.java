package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No039 {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length==0 || target <=0){
            return result;
        }
        Arrays.sort(candidates);
        help(candidates, target, 0, new ArrayList<>());
        return result;
    }

    private void help(int[] candidates, int target, int fromIndex, List<Integer> list){
        for (int i=fromIndex;i<candidates.length;++i){
            int c = candidates[i];
            if (c == target){
                List<Integer> l = new ArrayList<>(list);
                l.add(c);
                result.add(l);
            }else if (target > c){
                list.add(c);
                help(candidates, target-c, i, list);
                list.remove(list.size()-1);
            }else {
                break;
            }
        }
    }
}
