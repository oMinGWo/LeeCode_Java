package question;

public class No696 {
    public int countBinarySubstrings_my(String s) {
        int result=0;
        int i=0,j=0;
        int length = 0;
        while(i<s.length() && j<s.length()){
            if (s.charAt(i) == s.charAt(j)){
                j++;
                length++;
            }else{
                if (s.length() - j < length){
                    i++;
                    j=i;
                }else{
                    char x = s.charAt(i)=='1'?'0':'1';
                    if (isValid(s.substring(j,j+length),x)){
                        result+=length;
                        i=j;
                    }else{
                        i++;
                        j=i;
                    }
                }
                length=0;
            }
        }
        return result;
    }
    private boolean isValid(String x,char y){
        for (char a:x.toCharArray()){
            if (a!=y) return false;
        }
        return true;
    }
    public int countBinarySubstrings(String s) {
        int[] group = new int[s.length()];
        int k=0;
        for (int i=1;i<s.length();++i){
            if (s.charAt(i-1) == s.charAt(i)){
                group[k]++;
            }else{
                group[++k]=1;
            }
        }
        int re = 0;
        for (int i=1;i<k;++i){
            re+=Math.min(group[i-1],group[i]);
        }
        return re;
    }
}
