package question;

import extraClass.ListNode;
import extraClass.TreeNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class main {
    public static void main(String args[]){
        No102 n = new No102();
        LinkedHashMap l = new LinkedHashMap();
        l.put(1,1);
        int[] x = {12,28,83,4,25,26,25,2,25,25,25,12};
//        int[][] x = {{1,3,1},{1,5,1},{4,2,1}};
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        int[] inorder = {3,2,1};
        int[] postorder = {3,2,1};
        String s = "loveleetcode";
        System.out.println(n.levelOrder(root));
    }
}
