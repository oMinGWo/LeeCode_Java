package question;

import extraClass.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class No106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length==0 || postorder.length==0){
            return null;
        }
        if (inorder.length==1 && postorder.length==1 && inorder[0]==postorder[0]){
            return new TreeNode(inorder[0]);
        }
        int rootVal = postorder[postorder.length-1];
        TreeNode t = new TreeNode(rootVal);
        int rootIndex = 0;
        for (int i=0;i<inorder.length;++i){
            if (inorder[i] == rootVal){
                rootIndex = i;
            }
        }
        int[] inorderLeft = Arrays.copyOfRange(inorder,0,rootIndex);
        int[] inorderRight = Arrays.copyOfRange(inorder,rootIndex+1,inorder.length);
        int pivotIndex = 0;
        for (int i=0;i<postorder.length;++i){
            boolean have = false;
            for (int j=0;i<inorderLeft.length;++j){
                if (inorderLeft[j] == postorder[i]){
                    have = true;
                    break;
                }
            }
            if (!have){
                pivotIndex = i;
                break;
            }
        }
        int[] postLeft = Arrays.copyOfRange(postorder,0,pivotIndex);
        int[] postRight = Arrays.copyOfRange(postorder, pivotIndex,postorder.length-1);
        t.left = buildTree(inorderLeft, postLeft);
        t.right = buildTree(inorderRight, postRight);
        return t;
    }
}
