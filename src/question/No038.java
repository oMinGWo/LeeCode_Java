package question;

public class No038 {
	public String countAndSay(int n) {
		String re="1";
		int i=1;
		while(i<n){
			re=help(re);
			i++;
		}
		return re;
    }
	
	public String help(String s){
		char tmp=s.charAt(0);
		int num=1;
		String re="";
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==tmp){
				num++;
				continue;
			}
			re=re+num+tmp;
			tmp=s.charAt(i);
			num=1;
		}
		re=re+num+tmp;
		return re;
	}
	
}
