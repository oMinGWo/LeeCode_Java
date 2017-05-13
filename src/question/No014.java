package question;

public class No014 {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0 || strs==null){
            return "";
        }
		String prefix=strs[0];
		for(int i=0;i<strs.length;++i){
			int j=0;
			while(j<prefix.length()&&j<strs[i].length()&&strs[i].charAt(j)==prefix.charAt(j)){
				j++;
			}
			if(j==0){
				return "";
			}
			prefix=prefix.substring(0,j);
		}
		return prefix;
        
    }
}
