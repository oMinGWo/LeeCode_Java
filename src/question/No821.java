package question;

import java.util.ArrayList;

public class No821 {
    public int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i=0;i<S.length();++i){
            if (S.charAt(i) == C){
                a.add(i);
            }
        }
        for (int i=0;i<S.length();++i){
            if (S.charAt(i) == C){
                result[i] = 0;
            }else {
                int distance = Integer.MAX_VALUE;
                for (int x :a){
                    int temp = Math.abs(x-i);
                    if (temp <  distance){
                        distance = temp;
                    }
                }
                result[i] = distance;
            }
        }
        return result;
    }
}
