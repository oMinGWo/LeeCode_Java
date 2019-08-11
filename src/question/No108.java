package question;

import extraClass.TreeNode;

public class No108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums, 0, nums.length-1);
    }
    private TreeNode help(int[] nums, int low, int high){
        if(low>high){
            return null;
        }
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = help(nums,low,mid-1);
        root.right = help(nums, mid+1,high);
        return root;
    }
}
