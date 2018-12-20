package question;

public class No713 {
    //网上的双指针法
    //https://blog.csdn.net/Koala_Tree/article/details/78497275
    public int numSubarrayProductLessThanK3(int[] nums, int k) {
        if (nums ==null || nums.length==0 || k<=1){
            return 0;
        }
        int res = 0;
        int start = 0;
        int end = 0;
        int multi = 1;
        while (end < nums.length){
            multi *= nums[end];
            while (multi >= k){
                multi /= nums[start];
                start ++;
            }
            res += end - start + 1;
            end ++;
        }
        return res;
    }
    //评论里的解法
    //84个用例A了80个。。还是超时
    public int numSubarrayProductLessThanK2(int[] nums, int k) {
        if (nums ==null || nums.length==0 || k<=1){
            return 0;
        }
        int result = 0;
        int start = 0;
        int end = 0;
        for (int i=0;i<nums.length;++i){
            start = i;
            int multi = 1;
            for (int j=i;j<nums.length;++j){
                if (multi * nums[j] < k){
                    multi *= nums[j];
                    if (j==nums.length-1){
                        end = j;
                    }
                }else {
                    end = j-1;
                    break;
                }
            }
            long n = end - start + 1;
            result += n * (n+1)/2;
            if (end == nums.length-1){
                break;
            }
            long f = end - i - 1 + 1;
            result -= f * (f+1)/2;
        }
        return result;
    }
    //TODO: 84个通过75个，全1的用例超时了
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums ==null || nums.length==0 || k<=1){
            return 0;
        }
        int result = 0;
        for (int i=0;i<nums.length;++i){
            int multi = 1;
            for (int j=i;j<nums.length;++j){
                if (multi * nums[j] < k){
                    multi *= nums[j];
                    result++;
                }else{
                    break;
                }
            }
        }
        return result;
    }
}
