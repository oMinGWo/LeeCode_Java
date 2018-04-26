package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No673 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> re = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        if (root==null){
            return re;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            double sum = 0;
            for (int i=0;i<n;++i){
                TreeNode node = queue.poll();
                sum+=node.val;
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
            re.add(sum/n);
        }
        return re;
    }
}
