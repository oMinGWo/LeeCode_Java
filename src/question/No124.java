package question;

import extraClass.TreeNode;

public class No124 {
    //like No687 && No543
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        help(root);
        return result;
    }

    private int help(TreeNode t){
        if (t==null){
            return 0;
        }
        int left = Math.max(0, help(t.left));
        int right = Math.max(0, help(t.right));
        result = Math.max(left + right + t.val, result);
        return t.val + Math.max(left,right);
    }
}
