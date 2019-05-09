package question;

import java.util.Arrays;

/**
 * Created by HenryLee on 2017/5/8.
 */
public class No455 {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length==0 || s.length==0){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int result=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
                j++;
                result++;
            }else {
                j++;
            }
        }
        return result;
    }
}
