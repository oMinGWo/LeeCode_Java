package question;

import java.util.HashMap;
import java.util.Map;

public class No409 {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c:s.toCharArray()){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        int result = 0;
        boolean haveOven = false;
        for (Character c:map.keySet()){
            result += map.get(c) / 2 * 2;
            if (!haveOven && map.get(c) % 2 == 1){
                haveOven = true;
            }
        }
        return result + (haveOven?1:0);
    }
}
