package question;

import java.util.Arrays;

public class No859 {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()){
            return false;
        }
        //这里处理的是aa和aa的情况
        if (A.equals(B)){
            char[] a = A.toCharArray();
            Arrays.sort(a);
            for (int i=0;i<a.length-1;++i) {
                if (a[i] == a[i+1]) {
                    return true;
                }
            }
            return false;
        }
        int index1 = -1;
        int index2 = -1;
        for (int i=0;i<A.length();++i) {
            if (A.charAt(i) != B.charAt(i)) {
                if (index1 == -1) {
                    index1 = i;
                }else if (index2 == -1) {
                    index2 = i;
                }else {
                    return false;
                }
            }
        }
        return index1 != -1 && index2 != -1 && A.charAt(index1) == B.charAt(index2) && A.charAt(index2) == B.charAt(index1);
    }
}
