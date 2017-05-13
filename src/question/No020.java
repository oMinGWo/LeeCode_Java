package question;

import java.util.Stack;

public class No020 {
	public boolean isValid(String s) {
		if(s.length()<=1){
			return false;
		}
		Stack<Character> stack=new Stack<Character>();
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++){
			if(a[i]=='(' || a[i]=='[' ||a[i]=='{'){
				stack.push(a[i]);
			}else if(a[i]==')'){
				if(stack.isEmpty()) return false;
				char x=stack.pop();
				if(x!='(') return false;
				else continue;
			}else if(a[i]==']'){
				if(stack.isEmpty()) return false;
				char x=stack.pop();
				if(x!='[') return false;
				else continue;
			}else if(a[i]=='}'){
				if(stack.isEmpty()) return false;
				char x=stack.pop();
				if(x!='{') return false;
				else continue;
			}
		}
		if(stack.isEmpty())
			return true;
		else 
			return false;
    }
}
