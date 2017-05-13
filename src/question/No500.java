package question;

import java.util.ArrayList;

public class No500 {
	public String[] findWords(String[] words) {
        ArrayList<String> re=new ArrayList<String>();
        String x="asdfghjkl";
        for(String word:words){
        	String t=word.toLowerCase();
        	if(help(t)){
        		System.out.println(word);
            	re.add(word);
        	}
        }
        System.out.println("123"+re.toString());
        String[] xx=new String[re.size()];
        for(int i=0;i<re.size();++i){
        	xx[i]=re.get(i);
        }
		return xx;
    }
	public boolean help(String s){
		s=s.toLowerCase();
		String aa="qwertyuiop";
		String bb="asdfghjkl";
		String cc="zxcvbnm";
		String first=s.charAt(0)+"";
		if(aa.contains(first)){
			for(int i=0;i<s.length();i++){
				char c=s.charAt(i);
				if(!(c=='q' || c=='w' || c=='e' || c=='r' || c=='t' || c=='y' || c=='u' || c=='i' || c=='o' || c=='p')){
					return false;
				}
			}
		}else if(bb.contains(first)){
			for(int i=0;i<s.length();i++){
				char c=s.charAt(i);
				if(!(c=='a' || c=='s' || c=='d' || c=='f' || c=='g' || c=='h' || c=='j' || c=='k' || c=='l')){
					return false;
				}
			}
		}else{
			for(int i=0;i<s.length();i++){
				char c=s.charAt(i);
				if(!(c=='z' || c=='x' || c=='c' || c=='v' || c=='b' || c=='n' || c=='m')){
					return false;
				}
			}
		}
		return true;
	}
}
