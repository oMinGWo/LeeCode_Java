package question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No762 {
    public int countPrimeSetBits(int L, int R) {
        Set<Integer> prime = new HashSet<Integer>(Arrays.asList(2,3,5,7,11,13,17,19,23));
        int re=0;
        int[] count = new int[R+1];
        for(int i=1;i<=R;++i){
            count[i] = count[i>>2] + (i&1);
        }
        for(int i=L;i<=R;++i){
            if(prime.contains(count[i])){
                re ++;
            }
        }
        return re;
    }
}
