package question;

public class No860 {
    public boolean lemonadeChange(int[] bills) {
        if(bills.length==0){
            return true;
        }
        int count5=0;
        int count10=0;
        for(int i=0;i<bills.length;++i){
            int cash = bills[i];
            if(cash==5){
                count5++;
            }else if(cash==10){
                if(count5==0){
                    return false;
                }else {
                    count10++;
                    count5--;
                }
            }else if(cash==20){
                if(count10>0 && count5>0){
                    count10--;
                    count5--;
                }else if(count5 > 2){
                    count5 -=3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
