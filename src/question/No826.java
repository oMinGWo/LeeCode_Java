package question;

import java.util.Arrays;
import java.util.TreeMap;

public class No826 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < difficulty.length; ++i) {
            if (!map.containsKey(difficulty[i])) {
                map.put(difficulty[i], profit[i]);
            } else {
                int p = Math.max(map.get(difficulty[i]), profit[i]);
                map.put(difficulty[i], p);
            }
        }
        Arrays.sort(worker);
        int[] dp = new int[worker[worker.length-1]+1];
        dp[0] = map.getOrDefault(0,0);
        for (int i=1;i<dp.length;++i){
            dp[i] = Math.max(dp[i-1], map.getOrDefault(i,0));
        }
        int result = 0;
        for (int i:worker){
            result += dp[i];
        }
        return result;
    }
}
