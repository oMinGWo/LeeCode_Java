package question;

import extraClass.ListNode;
import extraClass.TreeNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class main {
    public static void main(String args[]){
        //Prepare data
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(2);
//        root.left.right.right = new TreeNode(1);
//        root.left.left.left = new TreeNode(3);
//        root.left.left.right = new TreeNode(-2);

//        root.right.left =new TreeNode(13);
//        root.right.right =new TreeNode(11);
//        root.right.right.left = new TreeNode(5);
//        root.right.right.right = new TreeNode(1);
        int[] inorder = {3,2,1};
        int[] postorder = {3,2,1};
        String s = "loveleetcode";
        int[] x = {1,2,3,0,2};

        No309 n = new No309();
        System.out.println(n.maxProfit(x));
    }
}
