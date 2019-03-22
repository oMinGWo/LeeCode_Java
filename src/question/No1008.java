package question;

import extraClass.TreeNode;

import java.util.Arrays;

public class No1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0){
            return null;
        }
        int root=preorder[0];
        int leftCount=0;
        for(int i=1;i<preorder.length;++i){
            if(preorder[i]<root){
                leftCount++;
            }else {
                break;
            }
        }
        int[] left= Arrays.copyOfRange(preorder,1,1+leftCount);
        int[] right=Arrays.copyOfRange(preorder, 1+leftCount, preorder.length);
        TreeNode t=new TreeNode(root);
        t.left=bstFromPreorder(left);
        t.right=bstFromPreorder(right);
        return t;
    }
}
