package question;

public class No309 {
    public int maxProfit(int[] prices) {
        if (prices==null || prices.length==0){
            return 0;
        }
        int[] hold = new int[prices.length+1];
        int[] rest = new int[prices.length+1];
        int[] sold = new int[prices.length+1];
        hold[0] = Integer.MIN_VALUE;
        rest[0] = 0;
        sold[0] = 0;
        for (int i=1;i<=prices.length;++i){
            rest[i] = Math.max(rest[i-1],sold[i-1]);
            sold[i] = hold[i-1] + prices[i-1];
            hold[i] = Math.max(hold[i-1],rest[i-1] - prices[i-1]);
        }
        return Math.max(sold[prices.length], rest[prices.length]);
    }

    //递归太深超时了
    private int help(int[] prices, int start, int end){
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for (int i=start;i<end;++i){
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }else {
                max = Math.max(max, prices[i] - minPrice + help(prices, i+2, end));
            }
        }
        return max;
    }
}
