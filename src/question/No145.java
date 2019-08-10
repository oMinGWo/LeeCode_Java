package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode t = stack.pop();
            if (t.left!=null){
                stack.push(t.left);
            }
            if (t.right!=null){
                stack.push(t.right);
            }
            result.add(0, t.val);
        }
        return result;
    }
}
