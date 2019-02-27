package question;

public class No747 {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i=0;i<nums.length;++i){
            if (nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        for (int i=0;i<nums.length;++i){
            if (i != index){
                if (max < nums[i] * 2){
                    return -1;
                }
            }
        }
        return index;
    }
}
