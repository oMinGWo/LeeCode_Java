package question;

public class No110 {
	public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left=depth(root.left,1);
        int right=depth(root.right,1);
        if(Math.abs(left-right)>1) return false;
        else
		return isBalanced(root.left) && isBalanced(root.right);
    }
	
	public int depth(TreeNode t,int cur){
		if(t==null) return cur;
		return Math.max(depth(t.left,cur+1),depth(t.right,cur+1));
	}
}
