package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No098 {
    //敲黑板： 二叉搜索树的中序遍历是递增的，这两个是充分必要条件，可以互相验证！
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        help(root);
        for (int i=0;i<list.size()-1;++i){
            if (list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;
    }
    private void help (TreeNode t){
        if (t==null){
            return;
        }
        help(t.left);
        list.add(t.val);
        help(t.right);
    }
}
