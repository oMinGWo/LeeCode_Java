package question;

/**
 * Created by HenryLee on 2017/5/9.
 */
public class No404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        return count(root,false);
    }

    private static int count(TreeNode node,boolean isLeft){
        if(node==null) return 0;
        if(node.left==null && node.right==null && isLeft==true) return node.val;
        return count(node.left,true)+count(node.right,false);
    }
}
