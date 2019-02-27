package question;

import extraClass.TreeNode;

import java.util.*;

public class No102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> ff = new ArrayList<>();
            List<TreeNode> list = new ArrayList<>();
            while(!queue.isEmpty()) {
                TreeNode x= queue.poll();
                list.add(x);
            }
            for (TreeNode t:list){
                if (t.left != null) {
                    queue.offer(t.left);
                }
                if (t.right != null) {
                    queue.offer(t.right);
                }
                ff.add(t.val);
            }
            result.add(ff);
        }
        return result;
    }
}
