package question;

import extraClass.TreeNode;

public class No114 {
    TreeNode prev;
    public void flatten(TreeNode root) {
        dfs(root);
    }
    private void dfs(TreeNode t){
        if (t==null){
            return;
        }
        dfs(t.right);
        dfs(t.left);
        t.right = prev;
        t.left = null;
        prev = t;
    }
}
