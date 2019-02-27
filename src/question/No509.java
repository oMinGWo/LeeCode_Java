package question;

public class No509 {
    public int fib(int N) {
        int a0=0;
        int a1=1;
        if (N==0){
            return a0;
        }
        if (N==1){
            return a1;
        }
        for (int i=0;i<=N;++i){
            int temp = a0 + a1;
            a1 = a0;
            a0 = temp;
        }
        return a1;
    }

    //空间换时间，不过时间好像也没怎么少
    public int fib1(int N) {
        if (N==0){
            return 0;
        }
        int[] re = new int[N+1];
        re[0] = 0;
        re[1] = 1;
        for (int i=2;i<=N;++i) {
            re[i] = re[i-1] + re[i-2];
        }
        return re[N];
    }
}
