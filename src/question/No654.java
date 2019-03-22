package question;

import extraClass.TreeNode;

import java.util.Arrays;

public class No654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int maxIndex=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]>nums[maxIndex]){
                maxIndex=i;
            }
        }
        TreeNode root=new TreeNode(nums[maxIndex]);
        int[] left= Arrays.copyOfRange(nums,0,maxIndex);
        int[] right=Arrays.copyOfRange(nums,maxIndex+1,nums.length);
        root.left=constructMaximumBinaryTree(left);
        root.right=constructMaximumBinaryTree(right);
        return root;
    }
}
