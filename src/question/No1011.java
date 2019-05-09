package question;

public class No1011 {
    public int shipWithinDays(int[] weights, int D) {
        int high = 10000;
        int low = 1;
        while (low < high-1){
            int mid = (high+low)/2;
            if (check(weights, D, mid)){
                high = mid;
            }else {
                low = mid;
            }
        }
        return high;
    }
    private boolean check(int[] weights, int D, int capacity){
        int j=0;
        for(int i=0;i<D;++i){
            int t=capacity;
            while(j<weights.length && t>=weights[j]){
                t-=weights[j++];
            }
            if(j==weights.length) {
                return true;
            }
        }
        return false;
    }
}
