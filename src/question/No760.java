package question;

public class No760 {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] re = new int[A.length];
        for(int i=0;i<A.length;++i){
            for(int j=0;j<B.length;++j){
                if(A[i] == B[j]) {
                    re[i]=j;
                }
            }
        }
        return re;
    }
}
