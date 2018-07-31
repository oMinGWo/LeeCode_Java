package question;

import extraClass.TreeNode;

public class No437 {
    //TODO
    public int pathSum(TreeNode root, int sum) {
        if (root == null){
            return 0;
        }
        return help(root,sum) + help(root.left,sum) + help(root.right,sum);
    }
    private int help(TreeNode root,int sum){
        if (root==null){
            return 0;
        }
        return (root.val==sum?1:0) + help(root.left,sum - root.val) + help(root.right,sum - root.val);
    }

}
