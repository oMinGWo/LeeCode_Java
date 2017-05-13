package question;

public class No125 {
	public boolean isPalindrome(String s) {
        if(s.length()<=1) return true;
        s=s.replaceAll(" ","");
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
        	char x=s.charAt(i);
        	char y=s.charAt(j);
        	if(!isChar(x) && !isNum(x)){
        		i++;
        		continue;
        	}
        	if(!isChar(y) && !isNum(y)){
        		j--;
        		continue;
        	}
        	if(x!=y) return false;
        	i++;
        	j--;
        }
		return true;
    }
	
	public boolean isChar(char x){
		return x>=97&&x<=122;
	}
	public boolean isNum(char x){
		return x>=48&&x<=57;
	}
}
