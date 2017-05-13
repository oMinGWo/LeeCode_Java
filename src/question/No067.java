package question;

import java.util.Stack;

public class No067 {
	public String addBinary(String a, String b) {
		String result="";
		if(a.equals("0")) return b;
		if(b.equals("0")) return a;
		int len1=a.length();
		int len2=b.length();
		if(len1<len2){
			for(int i=0;i<len2-len1;i++){
				a="0"+a;
			}
		}else{
			for(int i=0;i<len1-len2;i++){
				b="0"+b;
			}
		}
		Stack<String> s=new Stack<String>();
		char key='0';
		for(int i=a.length()-1;i>=0;i--){
			int temp=key+a.charAt(i)+b.charAt(i)-48*3;
			switch(temp){
			case 0:s.push("0");key='0';break;
			case 1:s.push("1");key='0';break;
			case 2:s.push("0");key='1';break;
			case 3:s.push("1");key='1';break;
			}
		}
		while(!s.isEmpty()){
			result+=s.pop();
		}
		if(key=='1') result="1"+result;
		return result;
    }
}











