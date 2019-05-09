package question;

public class No985 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] re=new int[queries.length];
        int sum=0;
        for(int i:A){
            if(i%2==0){
                sum+=i;
            }
        }
        for(int i=0;i<queries.length;++i){
            int value=queries[i][0];
            int index=queries[i][1];
            int rawValue=A[index];
            A[index] = rawValue + value;
            if(Math.abs(rawValue % 2) == 1){
                if(Math.abs(value % 2) == 1){
                    sum = sum + rawValue + value;
                }
            }else {
                if(Math.abs(value % 2) == 1){
                    sum = sum - rawValue;
                }else {
                    sum = sum + value;
                }
            }
            re[i] = sum;
        }
        return re;
    }
}
