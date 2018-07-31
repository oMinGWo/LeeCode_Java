package question;

import extraClass.TreeNode;

public class No108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return t(nums,0,nums.length-1);
    }
    private TreeNode t(int[] nums,int start,int end){
        if (start==end){
            return null;
        }
        int middle = (start+end)/2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = t(nums,start,middle);
        root.right = t(nums,middle+1,end);
        return root;
    }
}
