package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

public class No508 {
    HashMap<Integer,Integer> h = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null){
            int[] re = new int[0];
            return re;
        }
        getTreeSum(root);
        int max = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int key : h.keySet()){
            int nums = h.get(key);
            if (nums > max){
                max = nums;
            }
        }
        for (int key : h.keySet()){
            int nums = h.get(key);
            if (nums == max){
                result.add(key);
            }
        }
        int re[] = new int[result.size()];
        for (int i=0;i<re.length;++i){
            re[i] = result.get(i);
        }
        return re;
    }

    private int getTreeSum(TreeNode t){
        int sum = 0;
        if (t.right == null && t.left == null){
            sum =  t.val;
        }else if (t.left == null){
            sum = t.val + getTreeSum(t.right);
        }else if (t.right == null){
            sum = t.val + getTreeSum(t.left);
        }else {
            sum = t.val + getTreeSum(t.right) + getTreeSum(t.left);
        }
        if (h.containsKey(sum)){
            h.replace(sum, h.get(sum) + 1);
        }else {
            h.put(sum, 1);
        }
        return sum;
    }
}
