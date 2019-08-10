package question;

import extraClass.ListNode;
import extraClass.TreeNode;

import java.util.*;

public class main {
    public static void main(String args[]){
        String[] s = {"catg","ctaagt","gcta","ttca","atgcatc"};
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        No035 n = new No035();
        int[] x = {3,5,7,9,10};
        int[] y = {10,20,30,40,50};
        int[] z = {4,5,6,7,8,9,10};
        System.out.println(n.searchInsert(x,8));
    }
}
