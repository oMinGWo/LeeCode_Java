package question;

public class No551 {
    public boolean checkRecord(String s) {
        int acount = 0;
        int lcount = 0;
        char lastChar = '-';
        for (int i=0;i<s.length();++i){
            char c = s.charAt(i);
            if (c=='A'){
                acount++;
                lcount = 0;
                if(acount==2){
                    return false;
                }
            }else if(c=='L'){
                lcount++;
                if (lcount > 2){
                    return false;
                }
            }else {
                lcount = 0;
            }
        }
        return true;
    }
}
