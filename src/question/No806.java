package question;

import java.util.HashMap;

public class No806 {
    public int[] numberOfLines(int[] widths, String S) {
        char[] s = S.toCharArray();
        int count = 0;
        int numOfLines = 0;
        for (int i=0;i<s.length;++i){
            if (count + widths[s[i]-97] > 100){
                count = 0;
                numOfLines ++;
                i--;
            }else{
                count += widths[s[i]-97];
            }
        }
        int[] re = {numOfLines+1,count};
        return re;
    }
}
