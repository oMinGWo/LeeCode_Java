package question;

import java.util.ArrayList;
import java.util.List;

public class No728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> re = new ArrayList<Integer>();
        for(int i=left;i<=right;++i){
            if(isSelfDivided(i)){
                re.add(i);
            }
        }
        return re;
    }

    private boolean isSelfDivided(int num){
        int rawNum = num;
        while(num > 10){
            int left = num % 10;
            if(left == 0){
                return false;
            }
            if(rawNum % left != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
