package question;

import extraClass.TreeNode;

import java.util.HashMap;

public class No687 {
    //like No124 && No543
    int result = Integer.MIN_VALUE;
    public int longestUnivaluePath(TreeNode root) {
        help(root, root.val);
        return result;
    }

    private int  help(TreeNode t, int val){
        if (t==null){
            return  0;
        }
        int left = help(t.left, t.val);
        int right = help(t.right, t.val);
        result = Math.max(result, left + right);
        if (t.val == val){
            return 1 + Math.max(left,right);
        }
        return 0;
    }
}
