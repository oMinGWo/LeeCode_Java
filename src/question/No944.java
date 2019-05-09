package question;

public class No944 {
    public int minDeletionSize(String[] A) {
        if(A.length==0){
            return 0;
        }
        int result=0;
        for(int j=0;j<A[0].length();++j){
            for(int i=0;i<A.length-1;++i){
                if(A[i].charAt(j)>A[i+1].charAt(j)){
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
