package question;

import java.util.ArrayList;
import java.util.List;

public class No438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<s.length() - p.length();++i){
            if (help(s.substring(i,i+p.length()),p)){
                result.add(i);
            }
        }
        return result;
    }
    private boolean help(String s,String p){
        char[] c1 = s.toCharArray();
        char[] c2 = p.toCharArray();
        int[] cc = new int[256];
        for (char c:c1){
            cc[c]++;
        }
        for (char c:c2){
            cc[c]--;
        }
        for (int c:cc){
            if (c!=0){
                return false;
            }
        }
        return true;
    }
}
