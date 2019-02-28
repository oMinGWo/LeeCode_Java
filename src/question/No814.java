package question;

import extraClass.TreeNode;

public class No814 {
    public TreeNode pruneTree(TreeNode root) {
        if (isAllZero(root)){
            return null;
        }
        boolean left = isAllZero(root.left);
        boolean right = isAllZero(root.right);
        if (left){
            root.left = null;
        }
        if (right){
            root.right = null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root;
    }

    private boolean isAllZero(TreeNode root){
        if (root==null){
            return true;
        }
        return root.val == 0 && isAllZero(root.left) && isAllZero(root.right);
    }
}
