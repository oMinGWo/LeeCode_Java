package question;

import extraClass.ListNode;
import extraClass.TreeNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class main {
    public static void main(String args[]){
        String[] s = {"catg","ctaagt","gcta","ttca","atgcatc"};
        int[] x = {1,1,8,1,8};

        No671 n = new No671();
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.right.right=new TreeNode(7);
        root.right.left=new TreeNode(5);
        System.out.println(n.findSecondMinimumValue(root));
    }
}
