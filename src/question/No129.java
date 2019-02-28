package question;

import extraClass.TreeNode;

import java.util.ArrayList;

public class No129 {
	int result = 0;
	public int sumNumbers(TreeNode root) {
		if (root==null){
			return 0;
		}
		help(root,0);
		return result;
	}
	private void help(TreeNode t, int sum){
		if (t==null){
			return;
		}
		if (t.left==null && t.right==null){
			int x = sum * 10 + t.val;
			result+=x;
		}
		help(t.left, sum * 10 + t.val);
		help(t.right, sum * 10 + t.val);
	}
}
