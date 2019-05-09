package question;

public class No097 {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()){
            return false;
        }
        if(s1.equals("")){
            return s2.equals(s3);
        }
        if(s2.equals("")){
            return s1.equals(s3);
        }
        return dp(s1,s2,s3);
    }

    //TODO : read
    //动归解法
    private boolean dp(String s1, String s2, String s3){
        boolean[][] dp = new boolean[s1.length()+1][s2.length()+1];
        dp[0][0] = true;
        for (int i=1;i<s1.length()+1;++i){
            if (!dp[i-1][0] || s1.charAt(i-1) != s3.charAt(i-1)){
                continue;
            }
            dp[i][0] = true;
        }
        for (int i=1;i<s2.length()+1;++i){
            if (!dp[0][i-1] || s2.charAt(i-1) != s3.charAt(i-1)){
                continue;
            }
            dp[0][i] = true;
        }
        for (int i = 1; i < s1.length() + 1; i++) {
            for (int j = 1; j < s2.length() + 1; j++) {
                if(dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)){
                    dp[i][j] = true;
                    continue;
                }
                if(dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)){
                    dp[i][j] = true;
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    //这么做会超时
    private boolean help(String s1, String s2, String s3){
        if (s1.length()==0){
            return s2.equals(s3);
        }
        if (s2.length()==0){
            return s1.equals(s3);
        }
        char a = s1.charAt(0);
        char b = s2.charAt(0);
        char c = s3.charAt(0);
        if (a!=c && b!=c){
            return false;
        }else if(a==c && b!=c){
            return help(s1.substring(1), s2, s3.substring(1));
        }else if (a!=c && b==c){
            return help(s1, s2.substring(1), s3.substring(1));
        }else {
            return help(s1.substring(1), s2, s3.substring(1)) || help(s1, s2.substring(1), s3.substring(1));
        }
    }
}
