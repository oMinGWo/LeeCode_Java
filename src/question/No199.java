package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No199 {
    //二叉树的右视图
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> re=new ArrayList<>();
        if(root==null){
            return re;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<TreeNode> list=new ArrayList<>();
            while(!queue.isEmpty()){
                list.add(queue.poll());
            }
            re.add(list.get(list.size()-1).val);
            for(TreeNode t:list){
                if(t.left!=null) {
                    queue.offer(t.left);
                }
                if(t.right!=null) {
                    queue.offer(t.right);
                }
            }
        }
        return re;
    }
}
