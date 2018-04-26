package question;

import java.util.ArrayList;
import java.util.HashMap;

public class No575 {
    public int distributeCandies(int[] candies) {
        if(candies.length % 2!=0) {
            return 0;
        }
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        int res = 0;
        for(int i=0;i<candies.length;++i){
            if(!hashMap.containsKey(candies[i])){
                hashMap.put(candies[i],1);
            }else{
                int x = hashMap.get(candies[i]);
                hashMap.put(candies[i],x+1);
            }
            if(hashMap.get(candies[i])==1 && res < candies.length /2) {
                res++;
            }
        }
        return res;
    }
}
