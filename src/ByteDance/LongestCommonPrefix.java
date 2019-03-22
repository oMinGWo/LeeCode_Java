package ByteDance;

//字符串的最长公共前缀
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        String minStr = strs[0];
        for (int i=0;i<strs.length;++i){
            if (strs[i].length() < minStr.length()){
                minStr = strs[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<minStr.length();++i){
            char base = minStr.charAt(i);
            boolean allSame = true;
            for (int j=0;j<strs.length;++j){
                if (base!=strs[j].charAt(i)){
                    allSame=false;
                    break;
                }
            }
            if (allSame){
                sb.append(base);
            }else {
                break;
            }
        }
        return sb.toString();
    }
}
