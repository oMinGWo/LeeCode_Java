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
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        No151 n = new No151();
        System.out.println(n.reverseWords("  hello world!  "));
    }
}
