package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No257 {
    private List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        help(root,new ArrayList<>());
        return result;
    }

    private void help(TreeNode t, List<String> paths){
        if (t == null){
            return;
        }
        if (t.left == null && t.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<paths.size();++i){
                sb.append(paths.get(i)).append("->");
            }
            sb.append(t.val);
            result.add(sb.toString());
        }else {
            paths.add(t.val + "");
            help(t.left, paths);
            help(t.right, paths);
            paths.remove(paths.size()-1);
        }
    }
}
