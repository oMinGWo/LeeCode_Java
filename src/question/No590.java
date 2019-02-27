package question;

import extraClass.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No590 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        help(root);
        return result;
    }

    private void help(Node node){
        if (node == null){
            return;
        }
        for (Node n:node.children){
            help(n);
        }
        result.add(node.val);
    }

    //迭代法
    public List<Integer> postorder1(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root==null){
            return result;
        }
        stack.push(root);
        while(!stack.empty()){
            Node n = stack.pop();
            result.add(0,n.val);
            for (int i=0;i<n.children.size();i++){
                stack.push(n.children.get(i));
            }
        }
        return result;
    }
}
