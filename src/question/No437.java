package question;

import extraClass.TreeNode;

public class No437 {
    int result = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root==null){
            return result;
        }
        help(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return result;
    }
    private void help(TreeNode root, int sum){
        if (root==null){
            return;
        }
        if (root.val == sum){
            result++;
        }
        help(root.left, sum - root.val);
        help(root.right, sum - root.val);
    }
}
