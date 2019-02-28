package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        dfs(root1,list1);
        dfs(root2,list2);
        if (list1.size() != list2.size()){
            return false;
        }
        for (int i=0;i<list1.size();++i){
            if (list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;
    }

    public void dfs(TreeNode t, List<Integer> list){
        if (t==null){
            return ;
        }
        if (t.left == null && t.right == null){
            list.add(t.val);
        }
        dfs(t.left,list);
        dfs(t.right,list);
    }
}
