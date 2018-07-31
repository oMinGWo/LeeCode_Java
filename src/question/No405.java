package question;


public class No405 {
    //TODO 整理整理思路。。。
    public String toHex(int num) {
        String[] ref = {"0","1","2","3","4","5","6","7",
                "8","9","a","b","c","d","e","f"};
        String re = "";
        boolean isNegative = false;
        if (num<0){
            isNegative = true;
            num = -num;
        }
        StringBuilder num2 = new StringBuilder();
        while (num > 0){
            int t = num % 2;
            num2.insert(0, t);
            num /= 2;
        }
        if (!isNegative){
            int x = num2.length() % 4;
            for (int i=0;i<4-x;++i){
                num2.insert(0,0);
            }
        }else {
            int y = num2.length();
            for (int i = 0; i < 32 - y; ++i) {
                num2.insert(0, 0);
            }
        }
        return num2.toString();
    }
}
