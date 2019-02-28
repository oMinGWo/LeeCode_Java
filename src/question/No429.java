package question;

import extraClass.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> ff = new ArrayList<>();
            List<Node> list = new ArrayList<>();
            while(!queue.isEmpty()) {
                Node x= queue.poll();
                list.add(x);
            }
            for (Node t:list){
                for (Node f:t.children){
                    queue.offer(f);
                }
                ff.add(t.val);
            }
            result.add(ff);
        }

        return result;
    }
}
