package question;

import java.util.HashMap;

public class No290 {
	public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> h1=new HashMap();
        HashMap<String,Character> h2=new HashMap();
        char[] p=pattern.toCharArray();
        String[] s=str.split(" ");
        if(p.length!=s.length) return false;
        for(int i=0;i<p.length;i++){
        	if(!h1.containsKey(p[i])){
        		h1.put(p[i],s[i]);
        	}else{
        		String temp=h1.get(p[i]);
        		if(!temp.equals(s[i])) return false;
        	}
        }
        for(int i=0;i<s.length;i++){
        	if(!h2.containsKey(s[i])){
        		h2.put(s[i],p[i]);
        	}else{
        		char temp=h2.get(s[i]);
        		if(temp!=p[i]) return false;
        	}
        }
        return true;
    }
}
