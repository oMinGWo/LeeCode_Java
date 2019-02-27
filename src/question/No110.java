package question;

import extraClass.TreeNode;

public class No110 {
	public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        if(Math.abs(left-right)>1) return false;
        else
		return isBalanced(root.left) && isBalanced(root.right);
    }

    //和maxDepth一个效果，都是求深度
	public int depth(TreeNode t,int cur){
		if(t==null) return cur;
		return Math.max(depth(t.left,cur+1),depth(t.right,cur+1));
	}

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
