package Tencent;

public class No3 {
    public String longestPalindrome(String s) {
        if (s==null || s.length()==0){
            return "";
        }
        if (s.length()==1){
            return s;
        }
        int max = 0;
        int start=0;
        int end=0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i=0;i<s.length();++i){
            int j=i;
            while (j>=0){
                if (s.charAt(i)==s.charAt(j)&&(i-j<2||dp[j+1][i-1])){
                    dp[j][i]=true;
                    if (max < i-j+1) {
                        start = j;
                        end = i+1;
                        max = i-j+1;
                    }
                }
                j--;
            }
        }
        return s.substring(start,end);
    }
}
