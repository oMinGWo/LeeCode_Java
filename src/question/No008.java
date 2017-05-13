package question;

public class No008 {
	public static void main(String args[]){
		No008 n=new No008();
		System.out.println(n.myAtoi("+-8"));
	}
	public int myAtoi(String str) {
		if(str.length()==0 || str==null){
			return 0;
		}
		String t=str.trim();;
		String re="";
		int flag=1;
		if(t.charAt(0)=='-'){
			flag=-1;
			t=t.substring(1);
		}else if(t.charAt(0)=='+'){
			t=t.substring(1);
		}
		if(t.length()==0){
			return 0;
		}
		for(int i=0;i<t.length();i++){
			if(t.charAt(i)>'9' || t.charAt(i)<'0'){
				break;
			}
			re+=t.charAt(i)+"";
		}
		if(re.equals("")){
			return 0;
		}
		int result=0;
		try{
			result=Integer.parseInt(re);
		}catch(Exception e){
			if(flag==-1)
				return Integer.MIN_VALUE;
			return Integer.MAX_VALUE;
		}
		
		return result*flag;
		
		/*if(str.length()==0 || str==null){
			return 0;
		}
		int i=0;
		int flag=1;
		//long tmp=0;
		while(str.charAt(i)==' '){
			i++;
		}
		if(str.charAt(i)=='+'){
			i++;
		}else if(str.charAt(i)=='-'){
			i++;
			flag=-1;
		}
		String re="";
		for(int k=i;k<str.length();k++){
			if(str.charAt(k)>'9' || str.charAt(k)<'0'){
				break;
			}
			re+=str.charAt(k)+"";
		}
		if(re.equals("")){
			return 0;
		}
		int result=0;
		try{
			result=Integer.parseInt(re);
		}catch(Exception e){
			if(flag==-1)
				return Integer.MIN_VALUE;
			return Integer.MAX_VALUE;
		}
		
		return result*flag;*/
	}
}
