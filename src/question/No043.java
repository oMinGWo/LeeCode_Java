package question;

public class No043 {
    //143ms？超过6%？僵硬。。
    //比较屌的解法的思路
    //https://blog.csdn.net/afei__/article/details/83891547
    public String multiply(String num1, String num2) {
        boolean allZero1 = true;
        for (int i=0;i<num1.length();++i){
            if (num1.charAt(i) != '0') {
                allZero1 = false;
                break;
            }
        }
        boolean allZero2 = true;
        for (int i=0;i<num2.length();++i){
            if (num2.charAt(i) != '0') {
                allZero2 = false;
                break;
            }
        }
        if (allZero1 || allZero2) {
            return "0";
        }
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        String result = "0";
        for (int i=num1.length()-1;i>=0;--i){
            StringBuilder oneDigitResult = new StringBuilder();
            int isUp = 0;
            for (int j=num2.length()-1;j>=0;--j){
                int a = chars1[i] - '0';
                int b = chars2[j] - '0';
                int tempResult = a * b + isUp;
                if (tempResult > 9){
                    isUp = tempResult / 10;
                }else{
                    isUp = 0;
                }
                int thisDight = tempResult % 10;
                oneDigitResult.insert(0, thisDight);
            }
            if (isUp !=0) {
                oneDigitResult.insert(0,isUp);
            }
            for (int k=0;k<num1.length()-i-1;++k){
                oneDigitResult.append(0);
            }
            result = addString(result, oneDigitResult.toString());
        }
        return result;
    }

    private String addString(String a, String b){
        if ("0".equals(a)){
            return b;
        }else if ("0".equals(b)){
            return a;
        }
        if (a.length() < b.length()){
            StringBuilder sa = new StringBuilder(a);
            for (int i=0;i<b.length()-a.length();++i){
                sa.insert(0,"0");
            }
            a = sa.toString();
        }else {
            StringBuilder sb = new StringBuilder(b);
            for (int i=0;i<a.length()-b.length();++i){
                sb.insert(0,"0");
            }
            b = sb.toString();
        }
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        StringBuilder result = new StringBuilder();
        int isUp = 0;
        for (int i=a.length()-1;i>=0;--i){
            int t1 = x[i] - '0';
            int t2 = y[i] - '0';
            int t = t1 + t2 + isUp;
            isUp = t > 9?1:0;
            int r = t % 10;
            result.insert(0, r);
        }
        if (isUp==1){
            result.insert(0,1);
        }
        return result.toString();
    }
}
