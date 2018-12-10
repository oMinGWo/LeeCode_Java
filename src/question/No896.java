package question;

public class No896 {
    //另一种方法，记录一个非0的比较值，他等于第一个组不相同数字的大小状况
    //后面比较的时候，如果不是0，且store相同，则继续，不同则直接返回false
    public boolean isMonotonic(int[] A) {
        if (A.length <= 2){
            return true;
        }
        boolean isUp = true;
        boolean isDown = true;
        for (int i=0;i<A.length-1; ++i) {
            if (A[i] > A[i+1]) {
                isUp = false;
                break;
            }
        }
        for (int i=0;i<A.length-1; ++i) {
            if (A[i] < A[i+1]) {
                isDown = false;
                break;
            }
        }
        return isUp || isDown;
    }
}
