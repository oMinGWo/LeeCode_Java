package question;

public class No746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] totalCost = new int[cost.length+1];
//        totalCost[0] = cost[0];
//        totalCost[1] = cost[1];
        //TODO:为啥这里都要初始化成0，而不是像上面那样
        totalCost[0] = 0;
        totalCost[1] = 0;
        for (int i=2;i<totalCost.length;++i){
            totalCost[i] = Integer.min(totalCost[i-1]+cost[i-1],totalCost[i-2]+cost[i-2]);
        }
        return totalCost[cost.length];
    }
}
