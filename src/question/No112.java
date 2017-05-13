package question;

public class No112 {
	public static void main(String args[]){
		No112 n=new No112();
		TreeNode root=new TreeNode(-2);
		root.left=null;
		root.right=new TreeNode(-3);
		System.out.println(n.hasPathSum(root,-5));
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null) return false;
		if(root.left==null && root.right==null && root.val==sum) return true;
		if(root.left==null && root.right==null && root.val!=sum) return false;
		boolean a=hasPathSum(root.left,sum-root.val);
		boolean b=hasPathSum(root.right,sum-root.val);
		System.out.println(a+"   "+b);
        return a||b;
    }
}
