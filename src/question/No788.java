package question;

public class No788 {
    public int rotatedDigits(int N) {
        int result=0;
        for (int i=1;i<=N;++i){
            if (isValid(i)){
                result++;
            }
        }
        return result;
    }
    private boolean isValid(int x){
        boolean haveInvalidDigit = false;
        boolean haveNorT = false;
        while(x>0){
            int t = x%10;
            if (t==3 || t==4 || t==7){
                haveInvalidDigit = true;
                break;
            }else {
                if (t==2 || t==5 || t==6 || t==9){
                    haveNorT = true;
                }
            }
            x = x/10;
        }
        return !haveInvalidDigit && haveNorT;
    }
}
