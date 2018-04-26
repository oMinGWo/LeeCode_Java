package question;

public class No693 {
    public boolean hasAlternatingBits(int n) {
        if(n==0){
            return false;
        }
        int lastBit = -1;
        while(n!=0){
            int thisBit = n % 2;
            if(thisBit == lastBit){
                return false;
            }
            lastBit = thisBit;
            n = n / 2;
        }
        return true;
    }
}
