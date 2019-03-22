package ByteDance;

//无重复的最长子串
public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        int i=0;
        int j=0;
        boolean[] mark = new boolean[255];
        int max = 0;
        while(i<s.length() && j<s.length()){
            int curr=0;
            int index = s.charAt(j) - 0;
            while (mark[index]==false && j<s.length()){
                mark[index] = true;
                j++;
                if (j<s.length()) {
                    index = s.charAt(j)-0;
                }
            }
            curr = Math.max(curr,j-i);
            i++;
            j=i;
            max = Math.max(max, curr);
            for (int k=0;k<mark.length;++k){
                mark[k] = false;
            }
        }
        return max;
    }
}
