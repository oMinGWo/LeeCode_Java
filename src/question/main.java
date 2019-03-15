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

        No996 n = new No996();
        System.out.println(n.numSquarefulPerms(x));
    }
}
