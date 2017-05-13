package question;

public class No101 {
	public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return help(root.left,root.right);
    }
	
	public boolean help(TreeNode l,TreeNode r){
		if(l==null && r==null) return true;
		else if(l!=null && r!=null)
			return l.val==r.val&&help(l.left,r.right)&&help(l.right,r.left);
		else
			return false;
	}
}
