package question;

public class No367 {
    public boolean isPerfectSquare(int num) {
        int key = 65537;
        for (int i=0;i<key;++i){
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}
