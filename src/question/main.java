package question;

import extraClass.ListNode;
import extraClass.TreeNode;

import java.util.Arrays;

public class main {
    public static void main(String args[]){
        No713 n = new No713();
//        int[] x = {10,9,2,5,3,7,101,18};
        int[][] x = {{1,3,1},{1,5,1},{4,2,1}};
        int[] y = {10,5,2,6};
        System.out.println(n.numSubarrayProductLessThanK3(y, 100));
    }
}
