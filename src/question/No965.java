package question;

import extraClass.TreeNode;

public class No965 {
    public boolean isUnivalTree(TreeNode root) {
        if (root==null){
            return true;
        }
        boolean sameLeft = true, sameRight = true;
        if (root.left!=null){
            sameLeft = root.left.val == root.val;
        }
        if (root.right != null){
            sameRight = root.right.val == root.val;
        }
        if (!sameLeft || !sameRight){
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
