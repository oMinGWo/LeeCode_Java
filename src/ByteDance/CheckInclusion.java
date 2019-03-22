package ByteDance;

import java.util.ArrayList;
import java.util.Arrays;

//字符串的排列是否是另一个字符串的子串
public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        if(s1.length()==s2.length()){
            return s1.equals(s2);
        }
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        for(int i=0;i<=s2.length()-s1.length();++i){
            String subStr = s2.substring(i,i+s1.length());
            char[] c2 = subStr.toCharArray();
            Arrays.sort(c2);
            if (Arrays.toString(c1).equals(Arrays.toString(c2))){
                return true;
            }
        }
        return false;
    }
}
