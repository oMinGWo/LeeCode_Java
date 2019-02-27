package question;

import extraClass.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No589 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        help(root);
        return result;
    }
    private void help(Node node){
        if (node == null){
            return;
        }
        result.add(node.val);
        for (Node n:node.children){
            help(n);
        }
    }

    //尝试使用迭代法
    public List<Integer> preorder1(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            Node n = stack.pop();
            result.add(n.val);
            for (int i=n.children.size()-1;i>=0;i--){
                stack.push(n.children.get(i));
            }
        }
        return result;
    }
}
