package question;

import java.util.ArrayList;
import java.util.List;

public class No094 {
	ArrayList<Integer> re=new ArrayList<Integer>();
	public static void main(String args[]){
		
	}
	public List<Integer> inorderTraversal(TreeNode root) {
		Inorder(root);
        return re;
	}
	
	public void Inorder(TreeNode t){
		if(t==null) return;
		Inorder(t.left);
		re.add(t.val);
		Inorder(t.right);
	}
}
