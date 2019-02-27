package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No094 {
	ArrayList<Integer> re=new ArrayList<Integer>();
	public List<Integer> inorderTraversal(TreeNode root) {
		inorder(root);
        return re;
	}
	
	public void inorder(TreeNode t){
		if(t==null) {
			return;
		}
		inorder(t.left);
		re.add(t.val);
		inorder(t.right);
	}

	//非递归，迭代方法
	//大概的思路就是从左子树先把left一直入栈
	//到最后之后，出栈，然后把right入栈
	public List<Integer> inorderTraversal1(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		while(node!=null || !stack.empty()){
			while(node!=null) {
				stack.push(node);
				node = node.left;
			}
			if (!stack.empty()){
				TreeNode t = stack.pop();
				re.add(t.val);
				node = t.right;
			}
		}
		return re;
	}

}
