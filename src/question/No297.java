package question;

import extraClass.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class No297 {
    //TODO
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()) {
            TreeNode t = queue.poll();
            if (t==null){
                sb.append("null").append(":");
            }else {
                sb.append(t.val).append(":");
                queue.offer(t.left);
                queue.offer(t.right);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] ds = data.split(":");

        return null;
    }
}
