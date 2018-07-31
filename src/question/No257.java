package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No257 {
    public List<String> binaryTreePaths(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<String> result = new ArrayList<>();
        test(root,stack,result);
        return result;
    }
    private void test(TreeNode t,Stack<TreeNode> stack,List<String> result){
        if (t==null){
            return;
        }
        stack.push(t);
        if (t.left==null && t.right==null){
            printStack(stack,result);
            stack.pop();
        }else {
            test(t.left,stack,result);
            test(t.right,stack,result);
            stack.pop();
        }
    }
    private void printStack(Stack<TreeNode> stack,List<String> result){
        Stack<TreeNode> temp = new Stack<>();
        StringBuilder r = new StringBuilder(stack.peek().val + "");
        temp.push(stack.pop());
        while(!stack.empty()){
            r.insert(0, stack.peek().val + "->");
            temp.push(stack.pop());
        }
        result.add(r.toString());
        while (!temp.empty()){
            stack.push(temp.pop());
        }
    }
}
