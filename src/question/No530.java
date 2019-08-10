package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No530 {
    int min = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        help(root);
        for (int i=1;i<list.size();++i){
            min = Math.min(list.get(i)-list.get(i-1), min);
        }
        return min;
    }
    private void help(TreeNode root){
        if(root==null){
            return;
        }
        help(root.left);
        list.add(root.val);
        help(root.right);
    }
}
