package question;

public class No376 {
    public int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length <= 1){
            return nums.length;
        }
        int[] minus = new int[nums.length-1];
        for (int i=0;i<nums.length-1;++i){
            minus[i] = nums[i+1] - nums[i];
        }
        Boolean isPositive = null;
        int result = nums.length;
        for (int i=0;i<minus.length;++i){
            if (minus[i] == 0){
                result --;
                continue;
            }
            if (isPositive == null){
                isPositive = minus[i] > 0;
                continue;
            }
            if (isPositive) {
                if (minus[i] >= 0) {
                    result --;
                    continue;
                }else {
                    isPositive = false;
                }
            }else {
                if (minus[i] <= 0) {
                    result --;
                    continue;
                }else {
                    isPositive = true;
                }
            }
        }
        return result;
    }
}
