package question;

import java.util.ArrayList;
import java.util.List;

public class No943 {

    //我TM击败了0%可还行
    List<Integer> path = new ArrayList<>();
    int maxLength = Integer.MAX_VALUE;
    int[][] g;
    public String shortestSuperstring(String[] A) {
        g = new int[A.length][A.length];
        //预处理，g[i][j]为j放在i后面的长度
        for (int i=0;i<g.length;++i){
            for (int j=0;j<g.length;++j){
                g[i][j] = A[j].length();
                int length = Math.min(A[i].length(), A[j].length());
                for (int k=1;k<=length;k++){
                    if (A[i].substring(A[i].length()-k).equals(A[j].substring(0,k))){
                        g[i][j] = A[j].length()-k;
                    }
                }
            }
        }
        help(A,0,new boolean[A.length],0,new ArrayList<>());
        StringBuilder sb = new StringBuilder();
        sb.append(A[path.get(0)]);
        for (int i=1;i<path.size();++i){
            int prev = path.get(i-1);
            int now = path.get(i);
            sb.append(A[now].substring(A[now].length()-g[prev][now]));
        }
        return sb.toString();
    }

    private void help(String[] strings, int depth, boolean[] used, int length, List<Integer> curr){
        if (length>maxLength){
            return;
        }
        if (depth==strings.length){
            maxLength = length;
            path = new ArrayList<>(curr);
            return;
        }
        for (int i=0;i<strings.length;++i){
            if (used[i]){
                continue;
            }
            int newLength = depth==0?strings[i].length() : length + g[curr.get(curr.size()-1)][i];
            used[i] = true;
            curr.add(i);
            help(strings,depth+1,used,newLength,curr);
            curr.remove(curr.size()-1);
            used[i] =false;
        }
    }

    //DP解法
    public String shortestSuperstring2(String[] A) {

        return "";
    }
}
