package question;

import extraClass.TreeNode;

public class No236 {
    //644ms，这TM也太暴力了
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null){
            return null;
        }
        if (root==p && (haveTreeNode(root.right,q) || haveTreeNode(root.left,q))){
            return root;
        }
        if (root==q && (haveTreeNode(root.right,p) || haveTreeNode(root.left, p))){
            return root;
        }
        if (haveTreeNode(root.left,p) && haveTreeNode(root.right,q) ||
            haveTreeNode(root.left, q) && haveTreeNode(root.right, p)){
            return root;
        }
        TreeNode t1 = lowestCommonAncestor(root.left,p,q);
        return  t1==null?lowestCommonAncestor(root.right,p,q):t1;
    }

    private boolean haveTreeNode(TreeNode root, TreeNode t){
        if (root==null){
            return false;
        }
        if (root==t){
            return true;
        }
        return haveTreeNode(root.left, t) || haveTreeNode(root.right, t);
    }

    // https://www.youtube.com/watch?v=WqNULaUhPCc
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null){
            return null;
        }
        if (root==p || root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor2(root.left, p, q);
        TreeNode right = lowestCommonAncestor2(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }else if (left == null){
            return right;
        }else {
            return left;
        }
    }
}
