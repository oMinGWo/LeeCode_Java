package question;

import extraClass.TreeNode;

public class No226 {
	public TreeNode invertTree(TreeNode root) {
        if(root==null)
        	return null;
        TreeNode t=new TreeNode(-1);
        t=root.left;
        root.left=root.right;
        root.right=t;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
