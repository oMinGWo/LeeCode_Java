package question;

import extraClass.TreeNode;

import java.util.ArrayList;

public class No129 {
	//����������������д������ֱ�Ӿ�д����hhh
	ArrayList<String> a=new ArrayList<String>();
	public static void main(String args[]){
		TreeNode a=new TreeNode(1);
		a.left=new TreeNode(2);
		a.right=new TreeNode(3);
		No129 n=new No129();
		int re=n.sumNumbers(a);
		System.out.println(Integer.parseInt("012"));
	}
	public int sumNumbers(TreeNode root) {
		if(root.left==null && root.right==null) 
			return root.val;
		else if(root.left==null && root.right!=null){
			help(root.right,root.val+"");	
		}else if(root.left!=null && root.right==null){
			help(root.left,root.val+"");
		}else{
			help(root.left,root.val+"");
			help(root.right,root.val+"");
        }
		int sum=0;
		for(String i:a){
			int x=Integer.parseInt(i);
			sum+=x;
		}
		return sum;
    }
	
	public void help(TreeNode t,String s){
		if(t.left==null && t.right==null){
			a.add(s+t.val);
			return;
		}else if(t.left==null && t.right!=null){
			help(t.right,s+t.val);
		}else if(t.left!=null && t.right==null){
			help(t.right,s+t.val);
		}else{
			help(t.left,s+t.val);
			help(t.right,s+t.val);
        }
	}
}
