package question;

import extraClass.TreeNode;

import java.util.Stack;

public class No235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        search(s1,root,p);
        search(s2,root,q);
        while (s1.size() !=1 && s2.size() != 1){
            int x = s1.peek().val;
            int y = s2.peek().val;
            if (x == y){
                return s1.pop();
            }else{
                if (s1.size() < s2.size()){
                    s2.pop();
                }else if (s1.size() > s2.size()){
                    s1.pop();
                }else {
                    s1.pop();
                    s2.pop();
                }
            }
        }
        return root;
    }
    private void search(Stack<TreeNode> s,TreeNode r,TreeNode target){
        s.push(r);
        if (r.val != target.val){
            if (target.val < r.val){
                search(s,r.left,target);
            }else{
                search(s,r.right,target);
            }
        }
    }
}
