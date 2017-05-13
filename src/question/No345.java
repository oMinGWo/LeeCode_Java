package question;

import java.util.Stack;

public class No345 {
	public static void main(String args[]) {
		No345 n=new No345();
		System.out.println(n.reverseVowels("leetcode"));
	}
	public String reverseVowels(String s) {
        if(s==null || s.equals("")) return "";
        char[] ss=s.toCharArray();
        Stack<Character> stack=new Stack();
        for(char x:ss){
        	if(isVowel(x)){
        		stack.push(x);
        	}
        }
        for(int i=0;i<ss.length;i++){
        	if(isVowel(ss[i])){
        		ss[i]=stack.pop();
        	}
        }
		return new String(ss);
    }
	
	public boolean isVowel(char x){
		return x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||
				x=='A'||x=='E'||x=='I'||x=='O'||x=='U';
	}
}
