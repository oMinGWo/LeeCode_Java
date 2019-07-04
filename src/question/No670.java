package question;

import java.util.Arrays;

public class No670 {
    public int maximumSwap(int num) {
        if (num<10){
            return num;
        }
        String s = String.valueOf(num);
        char[] ss = s.toCharArray();
        for (int k=0;k<s.length();++k){
            char first = s.charAt(k);
            int switchIndex = -1;
            int index = s.length()-1;
            while (index>k){
                char x = ss[index];
                if (x>first){
                    if (switchIndex==-1 || ss[index] > ss[switchIndex]){
                        switchIndex=index;
                    }
                }
                index--;
            }
            if (switchIndex!=-1){
                ss[k] = ss[switchIndex];
                ss[switchIndex] = first;
                StringBuilder sb = new StringBuilder();
                for (int i=0;i<ss.length;++i){
                    sb.append(ss[i]);
                }
                return Integer.parseInt(sb.toString());
            }
        }
        return num;
    }
}
