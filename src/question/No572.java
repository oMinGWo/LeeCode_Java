package question;

import extraClass.TreeNode;

public class No572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s==null){
            return false;
        }
        return help(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    private boolean help(TreeNode s,TreeNode t) {
        return s == null && t == null ||
                s != null && t != null && s.val == t.val && help(s.left, t.left) && help(s.right, t.right);
    }
}
