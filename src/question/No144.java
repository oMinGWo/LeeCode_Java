package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No144 {
	ArrayList<Integer> re=new ArrayList<Integer>();
	public List<Integer> preorderTraversal(TreeNode root) {
		Preorder(root);
        return re;
	}
	
	public void Preorder(TreeNode t){
		if(t==null) return;
		re.add(t.val);
		Preorder(t.left);
		Preorder(t.right);
	}
}
