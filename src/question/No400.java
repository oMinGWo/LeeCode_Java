package question;

public class No400 {
    /**
     * @link https://leetcode.com/problems/nth-digit/discuss/88363/Java-solution
     */
    public int findNthDigit(int n) {
        int len = 1;
        //这里count应该是个Long，不然会越界
        long count = 9;
        int start = 1;
        while (n > len * count){
            n -= len * count;
            len ++;
            count *= 10;
            start *= 10;
        }
        start += (n - 1)/len;
        String s = start + "";
        return Character.getNumericValue(s.charAt((n-1)%len));
    }
}
