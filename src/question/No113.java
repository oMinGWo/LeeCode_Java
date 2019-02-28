package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No113 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        help(root, sum, new ArrayList<>());
        return result;
    }
    private void help(TreeNode node, int sum, List<Integer> list){
        if (node == null){
            return;
        }
        if (node.left == null && node.right == null && node.val == sum){
            list.add(node.val);
            result.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(node.val);
        help(node.left, sum-node.val, list);
        help(node.right, sum-node.val, list);
        list.remove(list.size()-1);
    }
}
