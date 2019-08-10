package question;

import extraClass.TreeNode;

public class No110 {
    static boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        help(root);
        return balanced;
    }
    private static int help(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = help(root.left);
        int r = help(root.right);
        if(Math.abs(l-r) <= 1){
            return Math.max(help(root.left),help(root.right)) + 1;
        }else{
            balanced = false;
            return -1;
        }
    }
}
