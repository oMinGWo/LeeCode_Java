package question;

import extraClass.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class No671 {
    //二叉树第2小的值
    public int findSecondMinimumValue(TreeNode root) {
        if (root==null){
            return -1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int min=Integer.MAX_VALUE;
        while (!queue.isEmpty()){
            TreeNode t=queue.poll();
            if (t.val<min && t.val!=root.val){
                min=t.val;
            }
            if (t.val>root.val){
                continue;
            }
            if(t.left!=null){
                queue.offer(t.left);
                queue.offer(t.right);
            }
        }
        if (min!=Integer.MAX_VALUE){
            return min;
        }else{
            return -1;
        }
    }
}
