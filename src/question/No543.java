package question;

import extraClass.TreeNode;

public class No543 {
    //like No124 && No687
    int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        help(root);
        return result;
    }

    private int help(TreeNode t){
        if (t==null){
            return 0;
        }
        int left = help(t.left);
        int right = help(t.right);
        result = Math.max(result, left + right);
        return 1 + Math.max(left, right);
    }
}
