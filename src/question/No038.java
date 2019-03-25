package question;

public class No038 {
	public String countAndSay(int n) {
		if(n==1){
			return "1";
		}
		int pos=1;
		String lastStr="1";
		StringBuilder sb=new StringBuilder();
		while(pos<n){
			char[] chars=lastStr.toCharArray();
			int count=0;
			char newChar='*';
			for(int i=0;i<chars.length;++i){
				if(newChar=='*'){
					newChar=chars[i];
					count=1;
				}else if(newChar==chars[i]){
					count++;
				}else if(newChar!=chars[i]){
					sb.append(count).append(newChar);
					count=1;
					newChar=chars[i];
				}
			}
			if(newChar!='*'){
				sb.append(count).append(newChar);
			}
			pos++;
			lastStr=sb.toString();
			sb=new StringBuilder();
		}
		return lastStr;
    }
}
