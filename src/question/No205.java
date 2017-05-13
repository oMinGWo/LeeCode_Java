package question;

import java.util.HashMap;

public class No205 {
	public static void main(String args[]){
		String s="foxo";
		String t="gccx";
		System.out.println(new No205().isIsomorphic(s, t));
	}
	public boolean isIsomorphic(String s, String t) {
		HashMap<Character,Character> m=new HashMap();
		for(int i=0;i<s.length();i++){
			if(!m.containsKey(s.charAt(i))){
				m.put(s.charAt(i),t.charAt(i));
			}else{
				char temp=m.get(s.charAt(i));
				if(temp!=t.charAt(i)) return false;
			}
		}
		m.clear();
		for(int i=0;i<s.length();i++){
			if(!m.containsKey(t.charAt(i))){
				m.put(t.charAt(i),s.charAt(i));
			}else{
				char temp=m.get(t.charAt(i));
				if(temp!=s.charAt(i)) return false;
			}
		}
        return true;
    }
}
