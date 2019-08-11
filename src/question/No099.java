package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class No099 {
    List<Integer> list = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        help(root);
        int left = list.get(0);
        int right = list.get(list.size()-1);
        for (int i=0;i<list.size();++i){
            if (list.get(i) > list.get(i+1)){
                left = list.get(i);
                break;
            }
        }
        for (int i=list.size()-1;i>=0;--i){
            if (list.get(i) < list.get(i-1)){
                right = list.get(i);
                break;
            }
        }
        swap(root, left, right);
    }
    private void swap(TreeNode root, int left, int right){
        if (root==null){
            return;
        }
        if (root.val == left){
            root.val = right;
        }else if (root.val == right){
            root.val = left;
        }
        swap(root.left, left, right);
        swap(root.right, left, right);
    }
    private void help(TreeNode root){
        if (root==null){
            return;
        }
        help(root.left);
        list.add(root.val);
        help(root.right);
    }
}
