package question;

import extraClass.TreeNode;

import java.util.*;

public class No107 {
    //TODO
    public Stack<TreeNode> stack = new Stack<>();
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		
        return null;
    }
    private void test(TreeNode node){
	    if (node==null){
	        return;
        }
	    if (node.left==null && node.right==null){
            stack.push(node);
        }else {
	        test(node.left);
	        test(node.right);
        }

    }
}
