package question;

/**
 * Created by HenryLee on 2017/5/9.
 */
public class No453 {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<min)
                min=i;
        }
        int re=0;
        for(int i:nums){
            re+=i-min;
        }
        return re;
    }
}
