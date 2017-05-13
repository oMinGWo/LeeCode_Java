package question;

import java.util.Arrays;

/**
 * Created by HenryLee on 2017/5/8.
 */
public class No455 {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int index=0;
        int re=0;
        for(int i=0;i<s.length;++i){
            if(s[i]>=g[index]){
                re++;
                index++;
                if(index>=g.length) break;
            }
        }

        return re;
    }
}
