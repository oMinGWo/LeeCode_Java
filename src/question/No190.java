package question;

import java.util.Stack;

public class No190 {
	public int reverseBits(int n) {
	    //TODO
        String s=Integer.toBinaryString(n);
        String t="";
        Stack<Character> stack=new Stack();
        for(int i=0;i<s.length();i++){
        	stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
        	t=t+stack.pop();
        }
		return (int)Long.parseLong(t,2);
    }
}
