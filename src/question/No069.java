package question;

public class No069 {
    public int mySqrt(int x) {
        if (x==0){
            return 0;
        }
        if (x <= 3){
            return 1;
        }
        long left=1;
        long right = x / 2 +1;
        while (left < right){
            long mid = (left + right + 1) / 2;
            long s = mid * mid;
            if (s > x){
                right = mid - 1;
            }else {
                left = mid ;
            }
        }
        return (int)left;
    }
}
