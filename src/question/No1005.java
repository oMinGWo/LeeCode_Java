package question;

import java.util.Arrays;

public class No1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        for(int i=0;i<A.length;++i){
            if (K==0){
                break;
            }
            int num=A[i];
            if (num<0){
                A[i] = -num;
                K--;
            }
        }
        if(K != 0 && K % 2 == 1){
            Arrays.sort(A);
            A[0] = -A[0];
        }
        return Arrays.stream(A).sum();
    }
}
